package org.ecommerce.action;

import java.util.List;
import org.ecommerce.dao.ClienteDAO;
import org.ecommerce.dao.VendasDAO;
import org.ecommerce.dao.ProdutoDAO;
import org.ecommerce.modelo.Cliente;
import org.ecommerce.modelo.Vendas;
import org.ecommerce.modelo.Produtos;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class VendasAction extends BaseAction{
    private final VendasDAO dao;
    private final ProdutoDAO p_dao;
    private final ClienteDAO c_dao;
    
    public VendasAction(VendasDAO dao, ProdutoDAO p_dao, ClienteDAO c_dao) {
        this.dao = dao;
        this.p_dao = p_dao;
        this.c_dao = c_dao;
    }
    
    public String salvar(){
        int id = input.getInt("id");
        Produtos prod = p_dao.buscarPorCodigo(id);
        Cliente c = c_dao.buscarPorCodigo(1);
        
        Vendas v = new Vendas();
        
        v.setIte_quantidade(2); 
        v.setIte_valor_parcial(prod.getPreco()*v.getIte_quantidade());
        v.setCod_prod(prod.getCodigo());
        v.setCod_cli(c.getCodigo());
        
        dao.salvar(v);
        //output.setObject(p);
       
        return SUCCESS; 
    }
    
    //Listar vendas
    public String listarVendas(){
        List<Vendas> lista = dao.listarTodos();
        output.setValue("lista", lista);
        output.setValue("user", getSessionObj());
       return SUCCESS;
    } 
}
