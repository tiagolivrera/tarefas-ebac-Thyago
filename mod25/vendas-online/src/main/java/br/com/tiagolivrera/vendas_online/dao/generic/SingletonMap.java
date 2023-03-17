package br.com.tiagolivrera.vendas_online.dao.generic;

import java.util.HashMap;
import java.util.Map;

public class SingletonMap {

	private static SingletonMap singletonMap;

	/*
	 * Contém todos os registros da aplicação
	 * simula um banco de dados
	 */
	@SuppressWarnings("rawtypes")
	protected Map<Class, Map<?, ?>> map;

	private SingletonMap() {
		map = new HashMap<>();
	}

	public synchronized static SingletonMap getInstance() {
		if (singletonMap == null) {
			singletonMap = new SingletonMap();
		}
		return singletonMap;
	}

	@SuppressWarnings("rawtypes")
	public Map<Class, Map<?, ?>> getMap() {
		return this.map;
	}

}
