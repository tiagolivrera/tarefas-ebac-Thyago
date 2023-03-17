package br.com.tiagolivrera.vendas_online;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tiagolivrera.vendas_online.dao.IProdutoDAO;
import br.com.tiagolivrera.vendas_online.dao.ProdutoDAO;
import br.com.tiagolivrera.vendas_online.domain.Produto;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public class ProdutoDAOTest {

	private IProdutoDAO produtoDAO;

	private Produto produto;

	public ProdutoDAOTest() {
		super();
		this.produtoDAO = new ProdutoDAO();
	}

	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
		produtoDAO.cadastrar(produto);
	}

	@Test
	public void pesquisar() {
		Produto produto = this.produtoDAO.consultar(this.produto.getCodigo());
		Assert.assertNotNull(produto);
	}

	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		produto.setCodigo("A2");
		Boolean retorno = produtoDAO.cadastrar(produto);
		Assert.assertTrue(retorno);
	}

	@Test
	public void excluir() {
		produtoDAO.excluir(produto.getCodigo());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rodrigo Pires");
		produtoDAO.alterar(produto);

		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}

	@Test
	public void buscarTodos() {
		Collection<Produto> list = produtoDAO.buscarTodos();
		assertTrue(list != null);
		assertTrue(list.size() == 2);
	}

}
