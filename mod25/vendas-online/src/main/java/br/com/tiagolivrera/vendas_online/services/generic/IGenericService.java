package br.com.tiagolivrera.vendas_online.services.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.tiagolivrera.vendas_online.dao.Persistente;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService <T extends Persistente, E extends Serializable>{

	/**
	 * 
	 * @param entity
	 * @return
	 * @throws TipoChaveNaoEncontradaException
	 */
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
	
	/**
	 * 
	 * @param valor
	 */
	public void excluir(E valor);
	
	/**
	 * 
	 * @param entity
	 * @throws TipoChaveNaoEncontradaException
	 */
	public void alterar(T entity) throws TipoChaveNaoEncontradaException;
	
	/**
	 * 
	 * @param valor
	 * @return
	 */
	public T consultar(E valor);
	
	/**
	 * 
	 * @return
	 */
	public Collection<T> buscarTodos();
}
