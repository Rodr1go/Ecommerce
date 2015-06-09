package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Cliente {
   private int codigo;
   private String nome;
   private String cpf;
   private String tel; 
   private String end;

   public Cliente(){
       
   }
   
   public Cliente(int codigo){
       this.codigo = codigo;
   }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
