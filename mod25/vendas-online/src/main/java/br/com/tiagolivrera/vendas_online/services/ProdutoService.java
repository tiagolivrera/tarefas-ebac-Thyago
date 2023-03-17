package br.com.tiagolivrera.vendas_online.services;

import br.com.tiagolivrera.vendas_online.dao.generic.IGenericDAO;
import br.com.tiagolivrera.vendas_online.domain.Produto;
import br.com.tiagolivrera.vendas_online.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService{

	public ProdutoService(IGenericDAO<Produto, String> dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

}
