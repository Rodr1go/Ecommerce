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
        <title>Fornecedores</title>
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
                
            <ul class="nav nav-pills">
                <li role="presentation"><a href="#">home</a></li>
                <li role="presentation"><a href="EcommerceAction.cadProdutos.mtw">Produtos</a></li>
                <li role="presentation" class="active"><a href="EcommerceAction.cadForn.mtw">Fornecedores</a></li>
                <li role="presentation"><a href="EcommerceAction.clientes.mtw">Clientes</a></li>
                <li role="presentation"><a href="EcommerceAction.vendas.mtw">Vendas</a></li>
            </ul>    
        </div>

        <div class="main">
            <div class="c1">
                <!--<div class="div_img"><img src="images/img1.jpg" width="auto" height="300"/></div>-->
                <div class="titulo_form">
                    <h3>Cadastro de fornecedores<hr></h3>
                </div>
                <form method="post" action="#" class="form1">
                    <p>
                        Desc : 
                        <mtw:input type="text" size="40" name="desc" />
                    </p>
                    <p>
                        CNPJ : 
                        <mtw:input type="text" size="40" name="cnpj" />
                    </p>
                    
                    <p>
                        TEL :
                        <mtw:input type="text" size="40" name="tel" />   
                    </p>
                    <p>
                        END :
                        <mtw:input type="text" size="40" name="end" />   
                    </p>
                    <input type="submit" value="Cadastrar fornecedores" class="btn btn-info"/>
                    <!--<a href="#" class="btn btn-info">Listar cadastros</a> -->
                </form>
                    
                <!-- Tabela -->    
                <div class="container">
                    <div class="row">
                        <div class="col-md-5">
                            <table class="table">
                                <tbody>
                                    <tr class="cab_tab">
                                        <th>COD</th>
                                        <th>DESC</th>
                                        <th>CNPJ</th>
                                        <th>TEL</th>
                                        <th>END</th>
                                    </tr>
                                    <tr>
                                        <td><mtw:out value="" /></td>
                                        <td><mtw:out value="desc" /></td>
                                        <td><mtw:out value="cnpj" /></td>
                                        <td><mtw:out value="tel" /></td>
                                        <td><mtw:out value="end" /></td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div> <!-- fim da tabela-->    
            </div>
        </div>

        <div class="footer">
            <p>Copyright © 2015</p>
        </div>
        <!--</div> -->
    </body>
</html>
