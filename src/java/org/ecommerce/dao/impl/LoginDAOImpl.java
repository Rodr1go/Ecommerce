package org.ecommerce.dao.impl;

import org.ecommerce.dao.LoginDAO;
import org.ecommerce.modelo.Login;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */

public class LoginDAOImpl implements LoginDAO{
    
    private final BeanSession beanSession;

    public LoginDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }

    @Override
    public Login buscarPorSenha(String senha) {
        
        Login u = new Login(senha);
        boolean ok = beanSession.load(u);
        if (ok) {
            return u;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean salvar(Login usuario){
           beanSession.insert(usuario);
          // beanSession.update(usuario);
        
      return true;  
    }
}
