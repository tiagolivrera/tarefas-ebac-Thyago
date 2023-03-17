package br.com.tiagolivrera.vendas_online.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.tiagolivrera.vendas_online.dao.Persistente;
import br.com.tiagolivrera.vendas_online.exceptions.TipoChaveNaoEncontradaException;

public interface IGenericDAO<T extends Persistente, E extends Serializable> {

	/**
	 * 
	 * @param entity a ser cadastrado
	 * @return true se for cadastrado, false caso contrário
	 * @throws TipoChaveNaoEncontradaException a classe não possui chave @TipoChave
	 */
	public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;

	/**
	 * 
	 * @param valor chave do objeto a ser excluido
	 */
	public void excluir(E valor);

	/**
	 * 
	 * @param entity objeto a ser alterado
	 * @throws TipoChaveNaoEncontradaException a classe não possui chave @TipoChave
	 */
	public void alterar(T entity) throws TipoChaveNaoEncontradaException;

	/**
	 * 
	 * @param valor chave do objeto a ser consultado
	 * @return
	 */
	public T consultar(E valor);

	/**
	 * 
	 * @return registros encontrados
	 */
	public Collection<T> buscarTodos();

}
