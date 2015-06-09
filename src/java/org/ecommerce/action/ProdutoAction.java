package org.ecommerce.action;

import java.text.DecimalFormat;
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
    
    private final ProdutoDAO dao;
    
    public ProdutoAction(ProdutoDAO dao) {
        this.dao = dao;
    }
    
    //single page
    public String singlePage(){
        int id = input.getInt("id");
        Produtos prod = dao.buscarPorCodigo(id);
        output.setValue("prod", prod.getPreco());
        output.setValue("id", id);
        
        DecimalFormat df = new DecimalFormat("0.##");
        double calc = prod.getPreco() * 0.8;
        String desconto = df.format(calc);
        
        output.setValue("desconto", desconto);
        return SUCCESS;
    }
    
    public String cadProdutos(){
         List<Produtos> lista = dao.listarTodos();
         output.setValue("lista", lista);
         output.setValue("user", getSessionObj()); //exibe o nome de usuário na página
         
      return SUCCESS;  
    }
    
    public String salvar(){
        Produtos p = input.getObject(Produtos.class);
        dao.salvar(p);
        output.setObject(p);
        
        List<Produtos> lista = dao.listarTodos();
         output.setValue("lista", lista);
         output.setValue("user", getSessionObj()); 
        
       return SUCCESS;
    }
    
    public String excluir(int codigo) {
        int id = input.getInt("id");
        Produtos prod = dao.buscarPorCodigo(id);
        dao.excluir(prod.getCodigo());
        
        List<Produtos> lista = dao.listarTodos();
         output.setValue("lista", lista);
         output.setValue("user", getSessionObj());
        
        return SUCCESS;
    }
}
