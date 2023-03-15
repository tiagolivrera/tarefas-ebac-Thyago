package br.com.tiagolivrera.service;

public interface IClienteService {
    
    public String salvar();

    String buscar(Long id);

    boolean atualizar(Long id, String novoCliente);

    boolean excluir(Long id);
}
