package org.ecommerce.dao.impl;

import org.ecommerce.dao.VendaDAO;
import org.ecommerce.modelo.Venda;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class VendaDAOImpl implements VendaDAO{
    
    private final BeanSession beanSession;

    public VendaDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }
    
    @Override
    public boolean salvar(Venda v) {
       if (v.getCodigo() <= 0) {
            beanSession.insert(v);	
        } else {
            beanSession.update(v);	
        }
        return true; 
    }
    
}
