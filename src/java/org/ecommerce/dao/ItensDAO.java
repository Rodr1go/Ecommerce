package org.ecommerce.dao;

import java.util.List;
import org.ecommerce.modelo.Itens;

/**
 *
 * @author stryker
 */
public interface ItensDAO {
     public boolean salvar(Itens Item); 
     
     public List<Itens> listarTodos();
}
