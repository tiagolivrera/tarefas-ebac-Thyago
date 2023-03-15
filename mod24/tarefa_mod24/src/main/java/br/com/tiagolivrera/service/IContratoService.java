package br.com.tiagolivrera.service;

public interface IContratoService {
    String salvar();

    String buscar(Long id);

    boolean atualizar(Long id, String novoCliente);

    boolean excluir(Long id);
}
