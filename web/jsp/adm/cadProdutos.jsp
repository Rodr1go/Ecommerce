<%-- 
    Document   : home
    Created on : 09/05/2015, 19:04:13
    Author     : stryker
--%>

<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<mtw:requiresAuthentication />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Produtos</title>
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
                <li role="presentation" class="active"><a href="#">Produtos</a></li>
                <li role="presentation"><a href="FornecedorAction.cadForn.mtw">Fornecedores</a></li>
                <li role="presentation"><a href="ClienteAction.listarClientes.mtw">Clientes</a></li>
                <li role="presentation"><a href="VendaAction.vendas.mtw">Vendas</a></li>
            </ul>    
        </div>

        <div class="main">
            <div class="c1">
                <!--<div class="div_img"><img src="images/img1.jpg" width="auto" height="300"/></div>-->
                <div class="titulo_form">
                    <h3>Cadastro de produtos<hr></h3>
                </div>
                <form method="post" action="ProdutoAction.salvar.mtw" class="form1">
                    <p>
                        Desc : 
                        <mtw:input type="text" size="40" name="descricao" />
                    </p>
                    <p>
                        Preço : 
                        <mtw:input type="text" size="40" name="preco" />
                    </p>

                    <p>
                        Quant. :
                        <mtw:input type="text" size="40" name="quantidade" />   
                    </p>
                    <p>
                        Forn : 
                        <select name="cod_forn" size="1" >
                            <option value="0">Escolha uma opção</option>
                            <option value="1">Adidas</option>
                            <option value="2">Camper</option>
                            <option value="3">Converse</option>
                            <option value="4">Dockers</option>
                            <option value="5">Kinetix</option>
                            <option value="6">Lacoste</option>
                            <option value="7">Nike</option>
                            <option value="8">New balance</option>
                            <option value="9">Puma</option>
                            <option value="10">Tiger</option>
                            <option value="11">Timberland</option>
                        </select>

                        <!-- Consertar o erro -->  
                    </p>
                    <input  type="submit" value="Cadastrar produtos" class="btn btn-info"/>
                    <!--<a href="#" class="btn btn-info">Listar cadastros</a> -->
                </form>

                <!-- Tabela -->    
                <div class="container">
                    <div class="row">
                        <div class="col-md-4">
                            <table class="table">
                                <tbody>
                                    <tr class="cab_tab">
                                        <th>COD</th>
                                        <th>DESC</th>
                                        <th>PREÇO</th>
                                        <th>QTD.</th>
                                    </tr>

                                    <mtw:list value="lista">
                                        <mtw:loop var="p">
                                            <tr>
                                                <td><mtw:out value="p.codigo" /></td>
                                                <td><mtw:out value="p.descricao" /></td>
                                                <td><mtw:out value="p.preco" /></td>
                                                <td><mtw:out value="p.quantidade" /></td>
                                            </tr>
                                        </mtw:loop> 
                                    </mtw:list>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div> <!-- fim da tabela-->
            </div>

            <div class="footer">
                <p>Copyright © 2015</p>
            </div>
        </div>


    </body>
</html>
