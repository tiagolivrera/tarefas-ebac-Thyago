package br.com.tiagolivrera.service;

import br.com.tiagolivrera.dao.IClienteDAO;

public class ClienteService implements IClienteService {
    private IClienteDAO clienteDao;

    public ClienteService(IClienteDAO clienteDao) {
        // clienteDao = new ClienteDao();
        // clienteDao = new ClienteDaoMock();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(Long id) {
        return clienteDao.buscar(id);
    }

    @Override
    public boolean atualizar(Long id, String novoCliente) {
        clienteDao.atualizar(id, novoCliente);
        return true;
    }

    @Override
    public boolean excluir(Long id) {
        clienteDao.excluir(id);
        return true;
    }

}
