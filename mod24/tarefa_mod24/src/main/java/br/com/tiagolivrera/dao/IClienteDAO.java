package br.com.tiagolivrera.dao;

public interface IClienteDAO {

    public String salvar();

    String buscar(Long id);

    void atualizar(Long id, String novoCliente);

    void excluir(Long id);
    
}
