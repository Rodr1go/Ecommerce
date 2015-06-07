package org.ecommerce.modelo;

/**
 *
 * @author stryker
 */
public class Fornecedor {
   private int codigo;
   private String descricao;
   private String cnpj;
   private String tel;
   private String end;

   public Fornecedor(){
       
   }
   
   public Fornecedor(int codigo){
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
