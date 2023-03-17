package br.com.tiagolivrera.vendas_online.services;

import br.com.tiagolivrera.vendas_online.domain.Cliente;
import br.com.tiagolivrera.vendas_online.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf);
}
