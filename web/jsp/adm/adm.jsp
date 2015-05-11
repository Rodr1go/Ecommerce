<%-- 
    Document   : home
    Created on : 09/05/2015, 19:04:13
    Author     : stryker
--%>

<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<mtw:requiresAuthentication redir="true" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
    </head>
    <body>
        <!-- <div class="wrapper"> -->
        <div class="header">
            <nav id="menu">
                <span class="info">Bem Vindo</span>
                <span class="name" ><mtw:out value="user"/></span>
                <div class="avatar"><a href="index.jsp"><img class="img_a" src="images/avatar.png" alt="avatar" /></a></div>
                <div class="logout">
                    <a href="LogoutAction.execute.mtw" ><img src="images/logout.png" alt="logout"/></a>
                </div>
            </nav>
        </div>

        <div class="main">
            <div class="c1">
                <div class="div_img"><img src="images/img1.jpg" width="auto" height="300"/></div>
                <div class="titulo_form">
                    <h3>Cadastro de clientes<hr></h3>
                </div>
                <form method="post" action="inserir_clientes.php" class="form1">
                    <p>
                        Nome : 
                        <input type="text" size="40" name="nome" />
                    </p>
                    <p>
                        E-mail : 
                        <input type="email" size="40" name="email" />
                    </p>
                    <p class="rd">
                        <input class="rd1" type="radio" value = "M" name="sexo" > <label class="lb1">Masculino</label> 
                        <input class="rd2" type="radio" value = "F" name="sexo" > <label class="lb2">Feminino</label>   
                    </p>
                    <p>
                        Idade :
                        <input type="text" size="40" name="idade" />   
                    </p>
                    <p>
                        Estado :
                        <select name="estado">
                            <option value="AL"> Alagoas </option>
                            <option value="PE"> Pernabuco </option>
                            <option value="PI"> Piauí­ </option>
                            <option value="BA"> Bahia </option>
                            <option value="RJ"> Rio de Janeiro </option>
                            <option value="SP"> São Paulo </option>
                        </select>   
                    </p>
                    <input  type="submit" value="Cadastrar cliente" class="btn btn-info"/>
                    <a href="listar_cadastros.php" class="btn btn-info">Listar cadastros</a> 
                </form>
            </div>
        </div>

        <div class="footer">
            <p>Todos os direitos reservados.</p>
        </div>
        <!--</div> -->
    </body>
</html>