package org.ecommerce.action;

import org.ecommerce.modelo.Venda;
import static org.mentawai.core.Action.SUCCESS;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class VendaAction extends BaseAction{
    
    public String vendas(){
        Venda venda = new Venda();
        venda.setTotal(input.getDouble("total"));
        
        output.setValue("user", getSessionObj());
        return SUCCESS;
    }
}
