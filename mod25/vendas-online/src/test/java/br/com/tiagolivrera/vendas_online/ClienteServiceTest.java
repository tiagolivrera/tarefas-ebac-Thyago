package br.com.tiagolivrera.vendas_online;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tiagolivrera.vendas_online.dao.ClienteDAOMock;
import br.com.tiagolivrera.vendas_online.dao.IClienteDAO;
import br.com.tiagolivrera.vendas_online.domain.Cliente;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;
import br.com.tiagolivrera.vendas_online.services.ClienteService;
import br.com.tiagolivrera.vendas_online.services.IClienteService;

public class ClienteServiceTest {

	private IClienteService clienteService;

	private Cliente cliente;

	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDAOMock();
		clienteService = new ClienteService(dao);
	}

	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Rodrigo");
		cliente.setCidade("São Paulo");
		cliente.setEndereco("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTelefone(1199999999L);

	}

	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}

	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);

		Assert.assertTrue(true);
	}

	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Rodrigo Pires");
		clienteService.alterar(cliente);

		Assert.assertEquals("Rodrigo Pires", cliente.getNome());
	}

}
