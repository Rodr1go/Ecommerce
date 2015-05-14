package org.ecommerce;

import org.ecommerce.action.EcommerceAction;
import org.ecommerce.action.LoginAction;
import org.ecommerce.action.LogoutAction;
import org.mentawai.core.Action;
import org.mentawai.core.ApplicationManager;
import static org.mentawai.core.ApplicationManager.ERROR;
import static org.mentawai.core.ApplicationManager.LOGIN;
import static org.mentawai.core.ApplicationManager.SUCCESS;
import static org.mentawai.core.ApplicationManager.fwd;
import static org.mentawai.core.ApplicationManager.redir;
import org.mentawai.filter.AuthenticationFilter;

/**
 *
 * @author stryker
 */
public class AppManager extends ApplicationManager{
    
    /*@Override
    public void loadFilters() {
        filter(new AuthenticationFilter());
        on(LOGIN, redir("/jsp/login.jsp"));
    }*/
 
    @Override
    public void loadActions() {
        // Action da autenticação 
        action("/LoginAction", LoginAction.class)
            .on(SUCCESS, fwd("/jsp/adm/adm.jsp")) //Alterar p/ redirecionar p/ módulo admin 
            .on(ERROR, fwd("/jsp/erro_autenticacao.jsp"));
        
        action("/LogoutAction", LogoutAction.class)
            .on(SUCCESS, redir("index.jsp"));
        
        //------------------Navegação-----------------------
        action("/EcommerceAction", EcommerceAction.class, "contato")
            .on(SUCCESS, fwd("/jsp/contato.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "produtos")
            .on(SUCCESS, fwd("/jsp/produtos.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "singlePage")
            .on(SUCCESS, fwd("/jsp/single-page.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "login")
            .on(SUCCESS, fwd("/jsp/login.jsp"));
        
        /*----------------------------------------------------
                            ADMINISTRATIVO
        -----------------------------------------------------*/        
        action("/EcommerceAction", EcommerceAction.class, "cadProdutos")
            .on(SUCCESS, fwd("/jsp/adm/cadProdutos.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "cadForn")
            .on(SUCCESS, fwd("/jsp/adm/cadForn.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "clientes")
            .on(SUCCESS, fwd("/jsp/adm/clientes.jsp"));
        
        action("/EcommerceAction", EcommerceAction.class, "vendas")
            .on(SUCCESS, fwd("/jsp/adm/vendas.jsp"));
   }    
}
