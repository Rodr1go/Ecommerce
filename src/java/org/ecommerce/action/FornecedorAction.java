package org.ecommerce.action;

import java.util.List;
import org.ecommerce.dao.FornecedorDAO;
import org.ecommerce.modelo.Fornecedor;
import static org.mentawai.core.Action.SUCCESS;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class FornecedorAction extends BaseAction{
    
    private FornecedorDAO dao;   

    public FornecedorAction(FornecedorDAO dao) {
        this.dao = dao;
    }
    
    public String cadForn(){
        
        List<Fornecedor> lista = dao.listarTodos();
        output.setValue("lista", lista);
        output.setValue("user", getSessionObj());
       return SUCCESS; 
    }
    
    public String salvar(){
        
        Fornecedor forn = input.getObject(Fornecedor.class);
        dao.salvar(forn);
        output.setObject(forn);
       return SUCCESS;
    }
}
