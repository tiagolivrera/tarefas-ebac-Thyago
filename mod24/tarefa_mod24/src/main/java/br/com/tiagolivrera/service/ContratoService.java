package br.com.tiagolivrera.service;

import br.com.tiagolivrera.dao.IContratoDAO;

public class ContratoService implements IContratoService {

    private IContratoDAO contratoDao;

    public ContratoService(IContratoDAO dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar(Long id) {
        contratoDao.buscar(id);
        return "Contrato encontrado";
    }

    @Override
    public boolean atualizar(Long id, String novoContrato) {
        contratoDao.atualizar(id, novoContrato);
        return true;
    }

    @Override
    public boolean excluir(Long id) {
        contratoDao.excluir(id);
        return true;
    }

  
}