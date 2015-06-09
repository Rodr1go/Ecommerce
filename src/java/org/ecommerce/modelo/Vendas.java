package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Vendas {
    private int codigo;
    private int ite_quantidade;
    private double ite_valor_parcial;
    
    private int cod_prod;  //FK
    private int cod_cli; //FK
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIte_quantidade() {
        return ite_quantidade;
    }

    public void setIte_quantidade(int ite_quantidade) {
        this.ite_quantidade = ite_quantidade;
    }

    public double getIte_valor_parcial() {
        return ite_valor_parcial;
    }

    public void setIte_valor_parcial(double ite_valor_parcial) {
        this.ite_valor_parcial = ite_valor_parcial;
    }

    public int getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(int cod_venda) {
        this.cod_cli = cod_venda;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }
    
    
}
