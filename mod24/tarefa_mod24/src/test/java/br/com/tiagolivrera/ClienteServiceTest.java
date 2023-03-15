package br.com.tiagolivrera;

import org.junit.Assert;
import org.junit.Test;

import br.com.tiagolivrera.dao.ClienteDAO;
import br.com.tiagolivrera.dao.IClienteDAO;
import br.com.tiagolivrera.dao.mocks.ClienteDAOMock;
import br.com.tiagolivrera.service.ClienteService;

public class ClienteServiceTest {
    @Test
    public void salvarTest() {
        IClienteDAO mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IClienteDAO mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar(1L);
        Assert.assertEquals("Cliente encontrado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.buscar(1L);
        Assert.assertEquals("Cliente encontrado", retorno);
    }

    @Test
    public void atualizarTest() {
        IClienteDAO mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        boolean retorno = service.atualizar(1L, "novoCliente");
        Assert.assertTrue("Atualizacao do cliente", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        boolean retorno = service.atualizar(1L, "novoCliente");
        Assert.assertTrue("Atualizacao do cliente", retorno);
    }

    @Test
    public void excluirTest() {
        IClienteDAO mockDao = new ClienteDAOMock();
        ClienteService service = new ClienteService(mockDao);
        boolean retorno = service.excluir(1L);
        Assert.assertTrue("Remocao do cliente", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IClienteDAO mockDao = new ClienteDAO();
        ClienteService service = new ClienteService(mockDao);
        boolean retorno = service.excluir(1L);
        Assert.assertTrue("Remocao do cliente", retorno);
    }

}
