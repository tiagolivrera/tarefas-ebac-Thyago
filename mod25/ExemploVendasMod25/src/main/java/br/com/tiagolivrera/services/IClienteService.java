package br.com.tiagolivrera.services;

import br.com.tiagolivrera.domain.Cliente;

/**
 *
 * @author thyago
 */
public interface IClienteService {

    public Boolean salvar(Cliente cliente);

    public Cliente buscarPorCPF(Long cpf);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);
    
}
