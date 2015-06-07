package org.ecommerce.dao.impl;

import java.util.List;
import org.ecommerce.dao.ItensDAO;
import org.ecommerce.modelo.Itens;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class ItensDAOImpl implements ItensDAO{
    
    private final BeanSession beanSession;

    public ItensDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }
    
    @Override
    public boolean salvar(Itens item){
        if (item.getIte_codigo() <= 0) {
            beanSession.insert(item);	
        } else {
            beanSession.update(item);	
        }
        return true;
    }
    
    @Override
    public List<Itens> listarTodos() {
        Itens c = new Itens();
        List<Itens> lista = beanSession.loadList(c);
        return lista;
    }
}
