import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Test;

import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;

public class ProdutoTest {

	@Test
	public void cadastrarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();

		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Mouse");
		produto.setPreco(BigDecimal.valueOf(45.3));

		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);

		Produto produtoBD = dao.consultar("01");
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertTrue(produto.getPreco().compareTo(produtoBD.getPreco()) == 0);

		Integer countDel = dao.excluir(produtoBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void consultarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();

		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Mouse");
		produto.setPreco(BigDecimal.valueOf(45.3));

		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);

		Produto produtoBD = dao.consultar("01");
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertTrue(produto.getPreco().compareTo(produtoBD.getPreco()) == 0);

		Integer countDel = dao.excluir(produtoBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void excluirTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();

		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Mouse");
		produto.setPreco(BigDecimal.valueOf(45.3));

		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);

		Produto produtoBD = dao.consultar("01");
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertTrue(produto.getPreco().compareTo(produtoBD.getPreco()) == 0);

		Integer countDel = dao.excluir(produtoBD);
		assertTrue(countDel == 1);
	}

	@Test
	public void atualizarTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();

		Produto produto = new Produto();
		produto.setCodigo("01");
		produto.setNome("Mouse");
		produto.setPreco(BigDecimal.valueOf(45.3));

		Integer countCad = dao.cadastrar(produto);
		assertTrue(countCad == 1);

		Produto produtoBD = dao.consultar("01");
		assertNotNull(produtoBD);
		assertNotNull(produtoBD.getId());
		assertEquals(produto.getCodigo(), produtoBD.getCodigo());
		assertEquals(produto.getNome(), produtoBD.getNome());
		assertTrue(produto.getPreco().compareTo(produtoBD.getPreco()) == 0);

		produtoBD.setCodigo("02");
		produtoBD.setNome("Mouse Gamer");
		produtoBD.setPreco(BigDecimal.valueOf(453.0));
		Integer countAtualizado = dao.atualizar(produtoBD);
		assertNotNull(countAtualizado);
		assertTrue(countAtualizado == 1);

		Produto produtoBD1 = dao.consultar("01");
		assertNull(produtoBD1);

		Produto produtoBD2 = dao.consultar("02");
		assertNotNull(produtoBD2);
		assertEquals(produtoBD.getId(), produtoBD2.getId());
		assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
		assertEquals(produtoBD.getNome(), produtoBD2.getNome());
		assertTrue(produtoBD.getPreco().compareTo(produtoBD2.getPreco()) == 0);

		List<Produto> list = dao.buscarTodos();
		int entries = 0;
		for (Produto p : list) {
			dao.excluir(p);
			entries++;
		}

		assertTrue(list.size() == entries);
	}

	@Test
	public void buscarTodosTest() throws Exception {
		IProdutoDAO dao = new ProdutoDAO();
		
		Produto p1 = new Produto();
		p1.setCodigo("01");
		p1.setNome("Mouse");
		p1.setPreco(BigDecimal.valueOf(45.0));
		Integer cadP1 = dao.cadastrar(p1);
		assertTrue(cadP1 == 1);
		
		Produto p2 = new Produto();
		p2.setCodigo("02");
		p2.setNome("Teclado");
		p2.setPreco(BigDecimal.valueOf(350.0));
		Integer cadP2 = dao.cadastrar(p2);
		assertTrue(cadP2 == 1);
		
		Produto p3 = new Produto();
		p3.setCodigo("03");
		p3.setNome("Monitor");
		p3.setPreco(BigDecimal.valueOf(650.0));
		Integer cadP3 = dao.cadastrar(p3);
		assertTrue(cadP3 == 1);
		
		List<Produto> list = dao.buscarTodos();
		assertTrue(list.size() == 3);
		
		int entries = 0;
		for (Produto p : list) {
			dao.excluir(p);
			entries++;
		}

		assertTrue(list.size() == entries);
	}
}
