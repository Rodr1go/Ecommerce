<%-- 
    Document   : home
    Created on : 09/05/2015, 19:04:13
    Author     : stryker
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<mtw:requiresAuthentication />
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
                <span class="name"><mtw:out value="user"/></span>
                <div class="avatar"><a href="index.jsp"><img class="img_a" src="images/avatar.png" alt="avatar" /></a></div>
                <div class="logout">
                    <a href="LogoutAction.execute.mtw" ><img src="images/logout.png" alt="logout"/></a>
                </div>
            </nav>

            <ul class="nav nav-pills">
                <li role="presentation" class="active"><a href="#">home</a></li>
                <li role="presentation"><a href="ProdutoAction.cadProdutos.mtw">Produtos</a></li>
                <li role="presentation"><a href="FornecedorAction.cadForn.mtw">Fornecedores</a></li>
                <li role="presentation"><a href="ClienteAction.listarClientes.mtw">Clientes</a></li>
                <li role="presentation"><a href="VendasAction.listarVendas.mtw">Vendas</a></li>
            </ul>
        </div>

        <div class="main">
            <div class="c1">
                <h1>Administrativo do site.</h1>
                <div class="div_img"><img class="img-adm" src="images/plataforma-e-commerce.jpg" width="600" height="350"/></div>
                
            </div>
            
            <div class="footer">
              <p>Copyright © 2015</p>
            </div>
        </div>

    </body>
</html>