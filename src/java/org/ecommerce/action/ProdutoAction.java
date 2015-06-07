package org.ecommerce.action;

import java.util.List;
import org.ecommerce.dao.ProdutoDAO;
import org.ecommerce.modelo.Produtos;
import static org.mentawai.core.Action.SUCCESS;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class ProdutoAction extends BaseAction{
    
    private ProdutoDAO dao;
    //private FornecedorDAO f_dao;
    
    public ProdutoAction(ProdutoDAO dao/*, FornecedorDAO f_dao*/) {
        this.dao = dao;
        //this.f_dao = f_dao;
    }
    
    //single page
    public String singlePage(){
        int id = input.getInt("id");
        Produtos prod = dao.buscarPorCodigo(id);
        output.setValue("prod", prod.getPreco());
        return SUCCESS;
    }
    
    public String cadProdutos(){
         List<Produtos> lista = dao.listarTodos();
         output.setValue("lista", lista);
         output.setValue("user", getSessionObj()); //exibe o nome de usuário na página
         /*List<Fornecedor> f_lista = f_dao.listarTodos();
         output.setValue("f_lista", f_lista);*/
      return SUCCESS;  
    }
    
    public String salvar(){
        
        Produtos p = input.getObject(Produtos.class);
        
        dao.salvar(p);
        output.setObject(p);
        
       return SUCCESS;
    }
}
