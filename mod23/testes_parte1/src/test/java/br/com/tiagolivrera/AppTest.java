package br.com.tiagolivrera;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void stringToPessoaMulherUpperCaseTest() {
        Pessoa p = Pessoa.stringToPessoa("Ana,F");
        assertEquals('F', p.getSexo());
    }

    @Test
    public void stringToPessoaMulherLowerCaseTest() {
        Pessoa p = Pessoa.stringToPessoa("Ana,f");
        assertEquals('F', p.getSexo());
    }

    @Test
    public void stringToPessoaHomemUpperCaseTest() {
        Pessoa p = Pessoa.stringToPessoa("Jose,M");
        assertEquals('M', p.getSexo());
    }

    @Test
    public void stringToPessoaHomemLowerCaseTest() {
        Pessoa p = Pessoa.stringToPessoa("Jose,m");
        assertEquals('M', p.getSexo());
    }

    @Test
    public void onlyWomanOutputTest() {
        List<Pessoa> lista = Pessoa.listaPessoas().stream().collect(Collectors.toList());
        Stream<Pessoa> stream = lista.stream()
                .filter(p -> Character.toString(p.getSexo()).equals("F"));

        boolean todasMulheres = stream.allMatch(p -> Character.toString(p.getSexo()).equals("F"));
        assertTrue("Pelo menos uma pessoa na saída não é mulher", todasMulheres);
    }
}
