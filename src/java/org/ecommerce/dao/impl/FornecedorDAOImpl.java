package org.ecommerce.dao.impl;

import java.util.List;
import org.ecommerce.dao.FornecedorDAO;
import org.ecommerce.modelo.Fornecedor;
import org.mentabean.BeanSession;

/**
 *
 * @author stryker
 */
public class FornecedorDAOImpl implements FornecedorDAO {

    private final BeanSession beanSession;

    public FornecedorDAOImpl(BeanSession beanSession) {
        this.beanSession = beanSession;
    }

    @Override
    public boolean salvar(Fornecedor f) {
        if (f.getCodigo() <= 0) {
            beanSession.insert(f);
        } else {
            beanSession.update(f);
        }
        return true;
    }

    //pegar o código para carregar o forn no produto
    @Override
    public Fornecedor buscarPorCodigo(int codigo) {
        
        Fornecedor forn = new Fornecedor(codigo);
        boolean ok = beanSession.load(forn);
        if (ok) {
            return forn;
        } else {
            return null;
        }
    }

    @Override
    public List<Fornecedor> listarTodos() {
        Fornecedor f = new Fornecedor();
        List<Fornecedor> lista = beanSession.loadList(f);

        return (lista);
    }
}
