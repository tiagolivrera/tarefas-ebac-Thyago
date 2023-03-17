package br.com.tiagolivrera.vendas_online;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tiagolivrera.vendas_online.dao.ClienteDAO;
import br.com.tiagolivrera.vendas_online.dao.IClienteDAO;
import br.com.tiagolivrera.vendas_online.domain.Cliente;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public class ClienteDAOTest {

	private IClienteDAO clienteDAO;

	private Cliente cliente;

	public ClienteDAOTest() {
		clienteDAO = new ClienteDAO();
	}

	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTelefone(1199999999L);
		clienteDAO.cadastrar(cliente);
	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setCpf(56565656565L);
		Boolean retorno = clienteDAO.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}

	@Test
	public void excluirCliente() {
		clienteDAO.excluir(cliente.getCpf());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteDAO.alterar(cliente);
		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}

	@Test
	public void buscarTodos() {
		Collection<Cliente> list = clienteDAO.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}

}
