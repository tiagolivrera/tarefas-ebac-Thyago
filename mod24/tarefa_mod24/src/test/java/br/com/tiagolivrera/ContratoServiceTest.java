package br.com.tiagolivrera;

import org.junit.Assert;
import org.junit.Test;

import br.com.tiagolivrera.dao.ContratoDAO;
import br.com.tiagolivrera.dao.IContratoDAO;
import br.com.tiagolivrera.dao.mocks.*;
import br.com.tiagolivrera.service.ContratoService;
import br.com.tiagolivrera.service.IContratoService;

public class ContratoServiceTest {
    @Test
    public void salvarTest() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar(1L);
        Assert.assertEquals("Contrato encontrado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar(1L);
        Assert.assertEquals("Contrato encontrado", retorno);
    }

    @Test
    public void atualizarTest() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.atualizar(1L, "novoContrato");
        Assert.assertTrue("Contrato atualizado", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.atualizar(1L, "novoContrato");
        Assert.assertTrue("Contrato atualizado", retorno);
    }

    @Test
    public void excluirTest() {
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir(1L);
        Assert.assertTrue("Contrato excluido", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir(1L);
        Assert.assertTrue("Contrato excluido", retorno);
    }
}
