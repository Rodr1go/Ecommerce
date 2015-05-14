package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Venda {
   private int codigo;
   private Cliente cli = new Cliente();
   private Double total;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
   
   
}
