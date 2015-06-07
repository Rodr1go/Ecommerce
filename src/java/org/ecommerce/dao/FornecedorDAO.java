package org.ecommerce.dao;

import java.util.List;
import org.ecommerce.modelo.Fornecedor;

/**
 *
 * @author stryker
 */
public interface FornecedorDAO {
    public boolean salvar(Fornecedor f);
    
    public List<Fornecedor> listarTodos(); 
    
    public Fornecedor buscarPorCodigo(int codigo);
}
