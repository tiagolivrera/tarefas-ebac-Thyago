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
public class ClienteDAO implements IClienteDAO{

    public ClienteDAO() {
    }

    @Override
    public Boolean salvar(Cliente cliente) {
        return true;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) {
        return null;
    }
    
}
