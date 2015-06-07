package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Produtos {
    private int codigo;
    private String descricao;
    private int quantidade;
    private Double preco;
    
    private int cod_forn; //FK
    private Fornecedor forn = null;

    public Produtos(){
        
    }
    
    public Produtos(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getCod_forn() {
        return cod_forn;
    }

    public void setCod_forn(int cod_forn) {
        this.cod_forn = cod_forn;
    }

    public Fornecedor getForn() {
        return forn;
    }

    public void setForn(Fornecedor forn) {
        this.forn = forn;
    }
}
