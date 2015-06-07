package org.ecommerce.dao.impl;

import java.util.List;
import org.ecommerce.dao.ClienteDAO;
import org.ecommerce.modelo.Cliente;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class ClienteDAOImpl implements ClienteDAO {

    private final BeanSession beanSession;

    public ClienteDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }

    @Override
    public boolean salvar(Cliente c) {
        if (c.getCodigo() <= 0) {
            beanSession.insert(c);	//sempre gera uma nova tupla no BD
        } else {
            beanSession.update(c);	//apenas atualiza os valores
        }
        return true;
    }

    @Override
    public List<Cliente> listarTodos() {
        Cliente c = new Cliente();
        List<Cliente> lista = beanSession.loadList(c);
        return lista;
    }
}
