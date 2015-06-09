<%-- 
    Document   : home
    Created on : 09/05/2015, 19:04:13
    Author     : stryker
--%>

<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ecommerce :: Cadastro de clientes</title>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/estilo.css" />
    </head>
    <body>
        <!-- <div class="wrapper"> -->
        <div class="header">
            <nav id="menu">
            </nav>

            <ul class="nav nav-pills">
                <li role="presentation"><a href="index.jsp">home</a></li>
                <li role="presentation" class="active"><a href="EcommerceAction.cadProdutos.mtw">Clientes</a></li>
            </ul>    
        </div>

        <div class="main">
            <div class="c1">
                <div class="titulo_form">
                    <h3>Cadastro de Clientes<hr></h3>
                </div>
                <form method="post" action="ClienteAction.salvar.mtw" class="form1">
                    <p>
                        Nome : 
                        <mtw:input type="text" size="40" name="nome" />
                    </p>
                    <p>
                        CPF : 
                        <mtw:input type="text" size="40" name="cpf" />
                    </p>

                    <p>
                        Tel :
                        <mtw:input type="text" size="40" name="tel" />   
                    </p>
                    <p>
                        End :
                    <mtw:input type="text" size="40" name="end" />   
                    </p>
                    <input  type="submit" value="Salvar dados" class="btn btn-info"/>
                </form>
            </div>
        </div>

        <div class="footer">
            <p>Copyright © 2015</p>
        </div>
        <!--</div> -->
    </body>
</html>
