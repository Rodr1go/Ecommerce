package org.ecommerce.action;

import org.ecommerce.dao.ItensDAO;
import org.ecommerce.dao.ProdutoDAO;
import org.ecommerce.modelo.Itens;
import org.ecommerce.modelo.Produtos;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class ItensAction extends BaseAction{
    private ItensDAO dao;
    private ProdutoDAO p_dao;
    
    public ItensAction(ItensDAO dao, ProdutoDAO p_dao) {
        this.dao = dao;
        this.p_dao = p_dao;
    }
    
    /*public String finalizaCompra(){
        return SUCCESS;
    }*/
    
    public String salvar(){
        int id = input.getInt("id");
        Produtos prod = p_dao.buscarPorCodigo(id);
        Itens p = new Itens();
        p.setIte_qtd(2); 
        p.setIte_valor_parcial(prod.getPreco()*p.getIte_qtd());
        dao.salvar(p);
        //output.setObject(p);
       
        return SUCCESS; 
    }
}
