package br.com.tiagolivrera.dao;

import br.com.tiagolivrera.domain.Cliente;

/**
 *
 * @author thyago
 */
public class ClienteDAOMock implements IClienteDAO {

    public ClienteDAOMock() {
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        Cliente cliente = new Cliente();
        cliente.setCpf(cpf);
        return cliente;
    }

}
