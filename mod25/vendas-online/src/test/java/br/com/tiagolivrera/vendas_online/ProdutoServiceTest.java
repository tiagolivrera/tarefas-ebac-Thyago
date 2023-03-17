package br.com.tiagolivrera.vendas_online;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.tiagolivrera.vendas_online.dao.IProdutoDAO;
import br.com.tiagolivrera.vendas_online.dao.ProdutoDAOMock;
import br.com.tiagolivrera.vendas_online.domain.Produto;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;
import br.com.tiagolivrera.vendas_online.services.IProdutoService;
import br.com.tiagolivrera.vendas_online.services.ProdutoService;

public class ProdutoServiceTest {

	private IProdutoService produtoService;

	private Produto produto;

	public ProdutoServiceTest() {
		IProdutoDAO dao = new ProdutoDAOMock();
		produtoService = new ProdutoService(dao);
	}

	@Before
	public void init() {
		produto = new Produto();
		produto.setCodigo("A1");
		produto.setDescricao("Produto 1");
		produto.setNome("Produto 1");
		produto.setValor(BigDecimal.TEN);
	}

	@Test
	public void pesquisar() {
		Produto produtor = this.produtoService.consultar(produto.getCodigo());
		Assert.assertNull(produtor);
	}

	@Test
	public void salvar() throws TipoChaveNaoEncontradaException {
		Boolean retorno = produtoService.cadastrar(produto);
		Assert.assertTrue(true);
	}

	@Test
	public void excluir() {
		produtoService.excluir(produto.getCodigo());
	}

	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		produto.setNome("Rodrigo Pires");
		produtoService.alterar(produto);

		Assert.assertEquals("Rodrigo Pires", produto.getNome());
	}

}
