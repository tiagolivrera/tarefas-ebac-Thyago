package com.tiagolivrera;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testAdiciona_HappyPath() {
        Assert.assertEquals("Utiliza o método adiciona() para calcular 2 + 2, retornando 4", 4,
                Calculadora.adicionar(2, 2));
    }

    @Test
    public void testSubtrair_HappyPath() {
        Assert.assertEquals("Utiliza o método subtrair() para calcular 2 - 2, retornando 0", 0,
                Calculadora.subtrair(2, 2));
    }

    @Test
    public void testMultiplicar_HappyPath() {
        Assert.assertEquals("Utiliza o método multiplicar() para calcular 2 * 2, retornando 4", 4,
                Calculadora.multiplicar(2, 2));
    }

    @Test
    public void testDividir_HappyPath() {
        Assert.assertEquals("Utiliza o método dividir() para calcular 2 / 2, retornando 1", 1,
                Calculadora.dividir(2, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDividir_divisaoPorZero() {
        Calculadora.dividir(1, 0);
    }
}
