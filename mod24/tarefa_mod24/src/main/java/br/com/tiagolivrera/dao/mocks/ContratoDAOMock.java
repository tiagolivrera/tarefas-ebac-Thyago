package br.com.tiagolivrera.dao.mocks;

import br.com.tiagolivrera.dao.IContratoDAO;

public class ContratoDAOMock implements IContratoDAO {

    @Override
    public void salvar() {
    }

    @Override
    public String buscar(Long id) {
        return "Objeto encontrado";
    }

    @Override
    public void atualizar(Long id, String novoContrato) {
    }

    @Override
    public void excluir(Long id) {
    }

}
