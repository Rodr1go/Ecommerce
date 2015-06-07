package org.ecommerce.dao;

import java.util.List;
import org.ecommerce.modelo.Produtos;

/**
 *
 * @author stryker
 */
public interface ProdutoDAO {
    
    public boolean salvar(Produtos p); 
    
    public List<Produtos> listarTodos();
    
    public Produtos buscarPorCodigo(int codigo);
}
