package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Login {
    private String username;
    private String senha;

    public Login(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
