package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Itens {
    private int ite_codigo;
    private int ite_qtd;
    private double ite_valor_parcial;
    
    private int cod_venda; //FK
    private int cod_prod;  //FK

    public int getIte_codigo() {
        return ite_codigo;
    }

    public void setIte_codigo(int ite_codigo) {
        this.ite_codigo = ite_codigo;
    }

    public int getIte_qtd() {
        return ite_qtd;
    }

    public void setIte_qtd(int ite_qtd) {
        this.ite_qtd = ite_qtd;
    }

    public double getIte_valor_parcial() {
        return ite_valor_parcial;
    }

    public void setIte_valor_parcial(double ite_valor_parcial) {
        this.ite_valor_parcial = ite_valor_parcial;
    }

    public int getCod_venda() {
        return cod_venda;
    }

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    
    
}
