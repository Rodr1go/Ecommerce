package org.ecommerce;

import org.ecommerce.action.ClienteAction;
import org.ecommerce.action.EcommerceAction;
import org.ecommerce.action.FornecedorAction;
import org.ecommerce.action.ItensAction;
import org.ecommerce.action.LoginAction;
import org.ecommerce.action.LogoutAction;
import org.ecommerce.action.ProdutoAction;
import org.ecommerce.action.VendaAction;
import org.ecommerce.dao.impl.ClienteDAOImpl;
import org.ecommerce.dao.impl.FornecedorDAOImpl;
import org.ecommerce.dao.impl.ItensDAOImpl;
import org.ecommerce.dao.impl.ProdutoDAOImpl;
import org.ecommerce.modelo.Cliente;
import org.ecommerce.modelo.Fornecedor;
import org.ecommerce.modelo.Itens;
import org.ecommerce.modelo.Produtos;
import org.ecommerce.util.Strings;
import org.mentabean.DBTypes;
import org.mentabean.jdbc.MySQLBeanSession;
import org.mentawai.core.Action;
import org.mentawai.core.ActionConfig;
import org.mentawai.core.ApplicationManager;
import static org.mentawai.core.ApplicationManager.ERROR;
import static org.mentawai.core.ApplicationManager.LOGIN;
import static org.mentawai.core.ApplicationManager.SUCCESS;
import static org.mentawai.core.ApplicationManager.fwd;
import static org.mentawai.core.ApplicationManager.redir;
import org.mentawai.db.BoneCPConnectionHandler;
import org.mentawai.db.ConnectionHandler;
import org.mentawai.filter.AuthenticationFilter;
import org.mentawai.filter.RedirectAfterLoginFilter;

/**
 *
 * @author stryker
 */
public class AppManager extends ApplicationManager {

    @Override
    public void loadActions() {
        
        // Action da autenticação 
        addGlobalFilter(new AuthenticationFilter());
 	addGlobalConsequence(AuthenticationFilter.LOGIN, redir("/jsp/login.jsp"));
 		
 	ActionConfig ac = new ActionConfig("/LoginAction", LoginAction.class);
 	ac.addConsequence(LoginAction.SUCCESS, fwd("/jsp/adm/adm.jsp"));
 	ac.addConsequence(LoginAction.ERROR,  fwd("/jsp/erro_autenticacao.jsp"));
 	addActionConfig(ac);
 	
 	ac.addFilter(new RedirectAfterLoginFilter());
 	ac.addConsequence(RedirectAfterLoginFilter.REDIR, redir()); 
         
 	ac = new ActionConfig("/LogoutAction", LogoutAction.class);
 	ac.addConsequence(LogoutAction.SUCCESS, redir("/index.jsp"));
 	addActionConfig(ac);
 	
        //------------------Navegação aberta-----------------------
        action("/EcommerceAction", EcommerceAction.class, "contato")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/contato.jsp"));

        action("/EcommerceAction", EcommerceAction.class, "produtos")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/produtos.jsp"));

        action("/ProdutoAction", ProdutoAction.class, "singlePage")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/single-page.jsp"));

        action("/EcommerceAction", EcommerceAction.class, "login")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/login.jsp"));

        action("/EcommerceAction", EcommerceAction.class, "cadClientes")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/cadClientes.jsp"));
        
        action("/ClienteAction", ClienteAction.class, "salvar")
                .bypassAuthentication()
                .on(SUCCESS, fwd("index.jsp"));
        
        /*action("/ItensAction", ItensAction.class, "finalizaCompra")
                .on(SUCCESS, fwd("/jsp/finalizaCompra.jsp"));*/
        
        action("/ItensAction", ItensAction.class, "salvar")
                .bypassAuthentication()
                .on(SUCCESS, fwd("/jsp/single-page.jsp"));
        
        /*----------------------------------------------------
         ADMINISTRATIVO
         -----------------------------------------------------*/
        action("/ProdutoAction", ProdutoAction.class, "cadProdutos")
                .on(SUCCESS, fwd("/jsp/adm/cadProdutos.jsp"));
        
        action("/ProdutoAction", ProdutoAction.class, "salvar")
                .on(SUCCESS, fwd("/jsp/adm/cadProdutos.jsp"));

        action("/FornecedorAction", FornecedorAction.class, "cadForn")
                .on(SUCCESS, fwd("/jsp/adm/cadForn.jsp"));

        action("/FornecedorAction", FornecedorAction.class, "salvar")
                .on(SUCCESS, fwd("/jsp/adm/adm.jsp"));
        
        action("/ClienteAction", ClienteAction.class, "listarClientes") 
                .on(SUCCESS, fwd("/jsp/adm/clientes.jsp"));

        action("/VendaAction", VendaAction.class, "vendas")
                .on(SUCCESS, fwd("/jsp/adm/vendas.jsp"));
    }

    @Override
    public void loadBeans() {
        // Tabela Cliente
        bean(Cliente.class, "Cliente") 
                .pk("codigo", DBTypes.AUTOINCREMENT)
                .field("nome", DBTypes.STRING)
                .field("cpf", DBTypes.STRING)
                .field("tel", DBTypes.STRING)
                .field("end", DBTypes.STRING);

        // Tabela Fornecedor
        bean(Fornecedor.class, "Fornecedor")
                .pk("codigo", DBTypes.AUTOINCREMENT)
                .field("cnpj", DBTypes.STRING)
                .field("descricao", DBTypes.STRING)
                .field("tel", DBTypes.STRING)
                .field("end", DBTypes.STRING);
        
         //Tabela Produtos
        bean(Produtos.class, "Produto")
                .pk("codigo", DBTypes.AUTOINCREMENT)
                .field("descricao", DBTypes.STRING)
                .field("preco", DBTypes.DOUBLE)
                .field("cod_forn", DBTypes.INTEGER)//FK
                .field("quantidade", DBTypes.INTEGER); 
            
         //Tabela Itens
        bean(Itens.class, "Itens")
                .pk("ite_codigo", DBTypes.AUTOINCREMENT)
                .field("ite_qtd", DBTypes.INTEGER)
                .field("ite_valor_parcial", DBTypes.DOUBLE);
                
    }

    // Setando o dialeto SQL  
    @Override
    public void setupIoC() {
        ioc("beanSession", MySQLBeanSession.class);
        ioc("clienteDAO", ClienteDAOImpl.class);
        ioc("fornecedorDAO",FornecedorDAOImpl.class);
        ioc("produtoDAO", ProdutoDAOImpl.class);
        ioc("itensDAO", ItensDAOImpl.class);
    }
    
    @Override
    public ConnectionHandler createConnectionHandler() { //realiza a conexão com o BD

        return new BoneCPConnectionHandler(Strings.bd_driver, Strings.bd_url, Strings.bd_usuario, Strings.bd_senha);
    }
}
