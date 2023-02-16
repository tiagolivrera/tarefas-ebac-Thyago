package br.com.tiagolivrera;

import br.com.tiagolivrera.dao.ClienteDAOMock;
import br.com.tiagolivrera.dao.IClienteDAO;
import br.com.tiagolivrera.domain.Cliente;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author thyago
 */
public class ClienteDAOTest {

    private IClienteDAO clienteDAO;
    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12345678910L);
        cliente.setNome("Thyago Freitas");
        cliente.setCidade("Guarabira");
        cliente.setEnd("Rua das Flores");
        cliente.setEstado("PB");
        cliente.setNumero(10);
        cliente.setTel(9781290381L);

        clienteDAO.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDAO.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }
    
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteDAO.salvar(cliente);        
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void alterarCliente(){
        cliente.setNome("Thyago Freitas");
        clienteDAO.alterar(cliente);
        Assert.assertEquals("Thyago Freitas", cliente.getNome());
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }
}
