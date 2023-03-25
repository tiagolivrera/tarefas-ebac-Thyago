import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;

public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Thyago Freitas");

		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);

		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

	@Test
	public void consultarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Thyago Freitas");

		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);

		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

	@Test
	public void excluirTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();

		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Thyago Freitas");

		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);

		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);
	}

	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Thyago Freitas");
		Integer countCad = dao.cadastrar(cliente);
		assertNotNull(countCad);
		assertTrue(countCad == 1);
		
		Cliente clienteBD = dao.consultar("01");
		assertNotNull(clienteBD);
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		clienteBD.setCodigo("02");
		clienteBD.setNome("Pedro Oliveira");
		Integer countUpdate = dao.atualizar(clienteBD);
		assertTrue(countUpdate == 1);
		
		Cliente clienteBD1 = dao.consultar("01");
		assertNull(clienteBD1);
		
		Cliente clienteBD2 = dao.consultar("02");
		assertNotNull(clienteBD2);
		assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
		assertEquals(clienteBD.getNome(), clienteBD2.getNome());
		
		List<Cliente> list = dao.buscarTodos();
		int entries = 0;
		for(Cliente cli : list) {
			dao.excluir(cli);
			entries++;
		}
		
		assertTrue(list.size() == entries);
	}

	@Test
	public void buscarTodosTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente1 = new Cliente();
		cliente1.setCodigo("01");
		cliente1.setNome("Thyago Freitas");
		Integer count1 = dao.cadastrar(cliente1);
		assertTrue(count1 == 1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setCodigo("02");
		cliente2.setNome("Mariana Freitas");
		Integer count2 = dao.cadastrar(cliente2);
		assertTrue(count2 == 1);
		
		Cliente cliente3 = new Cliente();
		cliente3.setCodigo("03");
		cliente3.setNome("Thallyson Freitas");
		Integer count3 = dao.cadastrar(cliente3);
		assertTrue(count3 == 1);
		
		List<Cliente> list = dao.buscarTodos();
		assertNotNull(list);
		assertTrue(list.size() == 3);
		
		int countDel = 0;
		for(Cliente cli : list) {
			dao.excluir(cli);
			countDel++;
		}
		assertTrue(list.size() == countDel);
		
		list = dao.buscarTodos();
		assertTrue(list.size() == 0);
		
	}

}
