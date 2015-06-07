package org.ecommerce.action;

import org.ecommerce.modelo.Fornecedor;
import org.ecommerce.modelo.Produtos;
import org.ecommerce.modelo.Venda;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class EcommerceAction extends BaseAction{
    
    public String contato(){
        return SUCCESS;
    }
    
    public String produtos(){
        return SUCCESS;
    }
    
    public String cadClientes(){
       return SUCCESS; 
    }
    
    public String login(){
       return SUCCESS;
    }
    
    /************************************************
    *           Códigos Administração           
    *************************************************/
    /*public String cadProdutos(){
        
        Produtos prod = new Produtos();
        prod.setDesc(input.getString("desc"));
        prod.setMarca(input.getString("marca"));
        prod.setPreco(input.getDouble("preco"));
        
        output.setValue("desc", prod.getDesc());
       return SUCCESS;
    }
    
    public String cadForn(){
        
        Fornecedor forn = new Fornecedor();
        forn.setCnpj(input.getString("cnpj"));
        forn.setDesc(input.getString("desc"));
        forn.setTel(input.getString("tel"));
        forn.setEnd(input.getString("end"));
        
       return SUCCESS;
    }
    
    public String clientes(){
       return SUCCESS;
    }
    
    public String vendas(){
        Venda venda = new Venda();
        venda.setTotal(input.getDouble("total"));
        return SUCCESS;
    }*/
}
