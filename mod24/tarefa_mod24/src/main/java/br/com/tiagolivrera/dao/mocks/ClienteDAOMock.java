package br.com.tiagolivrera.dao.mocks;

import br.com.tiagolivrera.dao.IClienteDAO;

public class ClienteDAOMock implements IClienteDAO {

    @Override
    public String salvar() {
        return null;
    }

    @Override
    public String buscar(Long id) {
        return "Cliente encontrado";
    }

    @Override
    public void atualizar(Long id, String novoCliente) {
    }

    @Override
    public void excluir(Long id) {
    }

}
