package br.com.tiagolivrera.vendas_online.dao;

import br.com.tiagolivrera.vendas_online.dao.generic.IGenericDAO;
import br.com.tiagolivrera.vendas_online.domain.Venda;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
