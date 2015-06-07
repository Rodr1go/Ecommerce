package org.ecommerce.modelo;

import java.util.Date;

/**
 *
 * @author stryker
 */
public class Venda {
   private int codigo;
   private Double total;
   private Date horario ;
   private Cliente cli = new Cliente();
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
   
   public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    
}
