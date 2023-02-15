/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.tiagolivrera.dao;

import br.com.tiagolivrera.domain.Cliente;

/**
 *
 * @author thyago
 */
public interface IClienteDAO {

    public Boolean salvar(Cliente cliente);
    
    public Cliente buscarPorCPF(Long cpf);
    
}
