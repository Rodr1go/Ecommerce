package org.ecommerce.dao;

import java.util.List;
import org.ecommerce.modelo.Cliente;

/**
 *
 * @author stryker
 */
public interface ClienteDAO {
    
    public boolean salvar(Cliente c);
    
    public List<Cliente> listarTodos();
}
