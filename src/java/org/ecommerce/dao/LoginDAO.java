package org.ecommerce.dao;

import org.ecommerce.modelo.Login;

/**
 *
 * @author stryker
 */
public interface LoginDAO {
    public boolean salvar(Login usuario);
    
    public Login buscarPorSenha(String senha);
}
