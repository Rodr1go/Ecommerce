package org.ecommerce.dao.impl;

import java.util.List;
import org.ecommerce.dao.VendasDAO;
import org.ecommerce.modelo.Vendas;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class VendasDAOImpl implements VendasDAO{
    
    private final BeanSession beanSession;

    public VendasDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }
    
    @Override
    public boolean salvar(Vendas venda){
        if (venda.getCodigo() <= 0) {
            beanSession.insert(venda);	
        } else {
            beanSession.update(venda);	
        }
        return true;
    }
    
    @Override
    public List<Vendas> listarTodos() {
        Vendas v = new Vendas();
        List<Vendas> lista = beanSession.loadList(v);
        return lista;
    }
}
