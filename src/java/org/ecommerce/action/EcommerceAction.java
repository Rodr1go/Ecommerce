package org.ecommerce.action;

import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class EcommerceAction extends BaseAction{
    
    public String contato(){
        return SUCCESS;
    }
    
    public String produtos(){
        return SUCCESS;
    }
    
    public String cadClientes(){
       return SUCCESS; 
    }
    
    public String login(){
       return SUCCESS;
    }
    
    public String home(){
        output.setValue("user", getSessionObj());
       return SUCCESS; 
    }    
}
