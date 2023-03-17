package br.com.tiagolivrera.vendas_online.domain;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import br.com.tiagolivrera.vendas_online.anotacoes.TipoChave;
import br.com.tiagolivrera.vendas_online.dao.Persistente;

public class Venda implements Persistente {

	public enum Status {
		INICIADA, CONCLUIDA, CANCELADA;
	}

	@TipoChave("getCodigo")
	private String codigo;
	private Cliente cliente;

	private Set<ProdutoQuantidade> produtos;
	private BigDecimal valorTotal;
	private Instant dataVenda;
	private Status status;

	public Venda() {
		produtos = new HashSet<ProdutoQuantidade>();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public Instant getDataVenda() {
		return dataVenda;
	}

	public Set<ProdutoQuantidade> getProdutos() {
		return produtos;
	}

	public Status getStatus() {
		return status;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setDataVenda(Instant dataVenda) {
		this.dataVenda = dataVenda;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	private void validarStatus() {
		if (this.status == Status.CONCLUIDA) {
			throw new UnsupportedOperationException("NÃO É POSSÍVEL ALTERAR UMA VENDA QUE JÁ FOI CONCLUÍDA");
		}
	}

	private void recalcularValorTotalVenda() {
		validarStatus();
		BigDecimal valorTotal = BigDecimal.ZERO;
		for (ProdutoQuantidade pqtde : this.produtos) {
			valorTotal = valorTotal.add(pqtde.getValorTotal());
		}
		this.valorTotal = valorTotal;
	}

	public void adicionarProduto(Produto produto, Integer quantidade) {
		validarStatus();
		Optional<ProdutoQuantidade> op = produtos.stream()
				.filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();
		if (op.isPresent()) {
			// produto já está na venda
			ProdutoQuantidade pqtde = op.get();
			pqtde.adicionar(quantidade);
		} else {
			// produto ainda não está na venda
			ProdutoQuantidade pqtde = new ProdutoQuantidade();
			pqtde.setProduto(produto);
			pqtde.adicionar(quantidade);
			produtos.add(pqtde);
		}
		recalcularValorTotalVenda();
	}

	public void removerProduto(Produto produto, Integer quantidade) {
		validarStatus();
		Optional<ProdutoQuantidade> op = produtos.stream()
				.filter(filter -> filter.getProduto().getCodigo().equals(produto.getCodigo())).findAny();
		if (op.isPresent()) {
			ProdutoQuantidade pqtde = op.get();
			if (pqtde.getQuantidade() > quantidade) {
				// remove a quantidade solicitada pelo usuario
				pqtde.remover(quantidade);
			} else {
				// se a quantidade solicitada é maior que a que está na venda, remove todos os
				// produtos daquele tipo da venda
				produtos.remove(op.get());
			}
			recalcularValorTotalVenda();
		}
	}

	public void removerTodosProdutos() {
		validarStatus();
		produtos.clear();
		valorTotal = BigDecimal.ZERO;
	}

	public Integer getQuantidadeTotalProdutos() {
		int qtde = produtos.stream().reduce(0, (partialCountResult, prod) -> partialCountResult + prod.getQuantidade(),
				Integer::sum);
		return qtde;
	}

}
