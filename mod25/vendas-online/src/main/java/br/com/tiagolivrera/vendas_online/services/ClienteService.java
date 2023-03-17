package br.com.tiagolivrera.vendas_online.services;

import br.com.tiagolivrera.vendas_online.dao.generic.IGenericDAO;
import br.com.tiagolivrera.vendas_online.domain.Cliente;
import br.com.tiagolivrera.vendas_online.services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IGenericDAO<Cliente, Long> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
