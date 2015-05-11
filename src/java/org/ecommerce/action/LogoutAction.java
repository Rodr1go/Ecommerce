
package org.ecommerce.action;

import org.mentawai.core.BaseAction;
import org.mentawai.filter.AuthenticationFree;

/**
 *
 * @author stryker
 */
public class LogoutAction extends BaseAction implements AuthenticationFree{
    
    public void logout(){
        session.reset();
    }
    
    @Override
    public String execute() throws Exception{
        
        logout();
      
       return SUCCESS;
    }
    
    @Override
    public boolean bypassAuthentication(String innerAction){
      
        return true;
    }
}
