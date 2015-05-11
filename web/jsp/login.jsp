<%-- 
    Document   : login
    Created on : 31/03/2015, 09:59:30
    Author     : stryker
--%>
<%@taglib prefix="mtw" uri="http://www.mentaframework.org/tags-mtw/"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/estilo_login.css" />
        <title>Página de administração</title>
    </head>
    
    <body>
        <mtw:form action="LoginAction.execute.mtw" method="post" id="login_form">
            <div class="top_b">Iniciar sessão como Administrador</div>    
            <div class="alert alert-info alert-login">
                Entre com nome de usuário e senha.
            </div>
            <div class="cnt_b">
                <div class="formRow">
                    <div class="input-prepend">
                        <span class="add-on"><i class="icon-user"></i></span><mtw:input type="text" id="username" name="user" />
                    </div>
                </div>
                <div class="formRow">
                    <div class="input-prepend">
                        <span class="add-on"><i class="icon-lock"></i></span><mtw:input type="password" id="password" name="pass" />
                    </div>
                </div>
                <div class="formRow clearfix">
                    <label class="checkbox"><input type="checkbox" />Lembrar</label>
                </div>
            </div>
            <div class="btm_b clearfix">
                <button class="btn btn-inverse pull-right" type="submit">Entrar</button>
                <!-- <span class="link_reg"><a href="#reg_form">Não é cadastrado? Registe-se aqui</a></span>-->
            </div>  
        </mtw:form>
    </body>
</html>