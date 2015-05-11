<%-- 
    Document   : erro_autenticacao
    Created on : 01/04/2015, 17:57:49
    Author     : stryker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Falha na autenticação</title>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/estilo_login.css" />
        <script type="text/javascript">
            function redirect() 
            {
                setTimeout("window.location='index.jsp'", 4000);
            }
        </script>
    </head>
    <body>
        <div class="main_box">
            <div class="msgbox">
                <div class="top_box">Login ou senha inválido!</div>    
                <div class="centro_box">Aguarde um instante para tentar novamente.</div>
                <div class="rodape_box"></div>
                
                <!--****(script para redirecionar à página de login)**** -->
                <script>redirect();</script>  
                
            </div>
        </div>
    </body>
</html>
