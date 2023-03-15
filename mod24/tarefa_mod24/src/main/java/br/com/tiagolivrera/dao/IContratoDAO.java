package br.com.tiagolivrera.dao;

public interface IContratoDAO {
    
    void salvar();

    String buscar(Long id);

    void atualizar(Long id, String novoContrato);

    void excluir(Long id);
}
