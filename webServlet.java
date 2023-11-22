package web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.mysql.jdbc.PreparedStatement;


@WebServlet("/webServlet")
public class webServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
    }



    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user= request.getParameter("newUsername");
        String password = request.getParameter("newPassword");

        if (validateUser(user, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect(request.getContextPath() + "/Accueil1.html");
        } else {
            request.setAttribute("errorMessage", "Nom d'utilisateur ou mot de passe incorrect");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
           
            if (validateUser(user, password)) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect(request.getContextPath() + "/Accueil1.html");
            }
                else {
                	 request.setAttribute("errorMessage", "Nom d'utilisateur ou mot de passe incorrect");
                     request.getRequestDispatcher("/index.jsp").forward(request, response);
                }
            } 
    }

    private boolean validateUser(String user, String password) {
        try (Connection conn = SingletonConnection.getConnection()) {
            String query = "SELECT * FROM utilisateur WHERE email=? AND motDePasse=?";
            try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, user);
                preparedStatement.setString(2, password);
                ResultSet resultSet = preparedStatement.executeQuery();
                return resultSet.next();
               
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
