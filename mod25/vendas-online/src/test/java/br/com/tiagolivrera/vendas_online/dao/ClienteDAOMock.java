package br.com.tiagolivrera.vendas_online.dao;

import java.util.Collection;

import br.com.tiagolivrera.vendas_online.domain.Cliente;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOMock implements IClienteDAO{

	@Override
	public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Long valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente consultar(Long valor) {
		Cliente cli = new Cliente();
		cli.setCpf(valor);
		return cli;
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
