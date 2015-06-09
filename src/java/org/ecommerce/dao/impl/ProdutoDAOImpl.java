package org.ecommerce.dao.impl;

import java.util.List;
import org.ecommerce.dao.ProdutoDAO;
import org.ecommerce.modelo.Produtos;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class ProdutoDAOImpl implements ProdutoDAO{
    
    private final BeanSession beanSession;

    public ProdutoDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }
    
    @Override
    public List<Produtos> listarTodos() {
        Produtos c = new Produtos();
        List<Produtos> lista = beanSession.loadList(c);
        return lista;
    }
    
    @Override
    public boolean salvar(Produtos p){
        if(p.getCodigo() <= 0){
           beanSession.insert(p);
        }else{
           beanSession.update(p);
        }
      return true;  
    } 
    
    @Override
    public Produtos buscarPorCodigo(int codigo) {
        
        Produtos prod = new Produtos(codigo);
        boolean ok = beanSession.load(prod);
        if (ok) {
            return prod;
        } else {
            return null;
        }
    }
    
    @Override
    public boolean excluir(int codigo) {
        Produtos prod = new Produtos(codigo);
        
        beanSession.delete(prod);
        return true;
    }
}
