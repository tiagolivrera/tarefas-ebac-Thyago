package br.com.tiagolivrera.services;

import br.com.tiagolivrera.domain.Cliente;
import br.com.tiagolivrera.dao.IClienteDAO;

/**
 *
 * @author thyago
 */
public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;
    
    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return clienteDAO.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return clienteDAO.buscarPorCPF(cpf);
    }

    @Override
    public void excluir(Long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) {
        clienteDAO.alterar(cliente);
    }
    
}
