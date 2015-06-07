package org.ecommerce.action;

import java.io.IOException;
import java.util.List;
import org.ecommerce.dao.ClienteDAO;
import org.ecommerce.modelo.Cliente;
import static org.mentawai.core.Action.SUCCESS;
import org.mentawai.core.BaseAction;

/**
 *
 * @author stryker
 */
public class ClienteAction extends BaseAction {

    private ClienteDAO dao;

    public ClienteAction(ClienteDAO dao) {
        this.dao = dao;
    }

    public String salvar() throws IOException {
        Cliente c = input.getObject(Cliente.class); //recebe um objeto compatível com a classe Cliente
        dao.salvar(c); //salva o objeto no BD
        output.setObject(c); //coloca o objeto no output para que JSPs possam pegá-lo
        return SUCCESS;
    }

    //Listar clientes
    public String listarClientes(){
        List<Cliente> lista = dao.listarTodos();
        output.setValue("lista", lista);
        output.setValue("user", getSessionObj());
       return SUCCESS;
    }
}
