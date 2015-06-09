package org.ecommerce.dao;

import java.util.List;
import org.ecommerce.modelo.Vendas;

/**
 *
 * @author stryker
 */
public interface VendasDAO {
     public boolean salvar(Vendas Item); 
     
     public List<Vendas> listarTodos();
}
