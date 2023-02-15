package br.com.tiagolivrera;

import br.com.tiagolivrera.dao.ClienteDAOMock;
import br.com.tiagolivrera.dao.IClienteDAO;
import br.com.tiagolivrera.services.ClienteService;
import br.com.tiagolivrera.domain.Cliente;
import br.com.tiagolivrera.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author thyago
 */
public class ClienteServiceTest {

    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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

        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
    
    @Test
    public void salvarCliente() {
        Boolean retorno = clienteService.salvar(cliente);
        
        Assert.assertTrue(retorno);
    }
}
