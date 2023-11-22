<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href = "styleAccueile.css"/>
  <title>Ensemble, agissons contre les changements climatiques</title>
  <link rel="stylesheet" href="styleac.css">

    <link rel="stylesheet" href="decouverte.css" />
   <link rel="stylesheet" href="apropos.css">
   <link rel="stylesheet" href="inscription.css">
  
 
</head>
<body>
  <header>
    <h1>Connectez-vous</h1>
    <nav>
      <ul>
  
  </header>

   <main>
        <section id="description">
            <h2></h2>
            <p>
                Le changement climatique est l'un des défis les plus pressants de notre époque. Ensemble, agissons pour protéger notre planète en adoptant des modes de vie durables et en participant à des actions concrètes. Découvrez comment vous pouvez contribuer à créer un avenir plus durable.
            </p>
        </section>

        
    </main>
        <section>
            <h2></h2>
            <form id="registerForm" action=webServlet method=post>
                <label for="newUsername">Mail d'utilisateur:</label>
                <input type="text" id="newUsername" name="newUsername" required>

                <label for="newPassword">Mot de passe:</label>
                <input type="password" id="newPassword" name="newPassword" required>

                <input type="submit" value="login">
               
            </form>
         
        </section>
    </main>
 
  </main>

  <footer>
    <p>Tous droits réservés &copy; 2023 lifkana</p>
    
  </footer>

  <script src="script.js"></script>
  
</body>
</html>