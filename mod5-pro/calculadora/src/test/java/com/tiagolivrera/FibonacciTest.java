package com.tiagolivrera;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    
    @Test
    public void testFibonacci_nIgualZero() {
        Assert.assertEquals("Fibonacci para n igual a zero", 0, Fibonacci.calculaSequencia(0));
    }

    @Test
    public void testFibonacci_nIgualUm() {
        Assert.assertEquals("Fibonacci para n igual a um", 1, Fibonacci.calculaSequencia(1));
    }

    @Test
    public void testFibonacci_nIgualDois() {
        Assert.assertEquals("Fibonacci para n igual a dois", 1, Fibonacci.calculaSequencia(2));
    }

    @Test
    public void testFibonacci_nIgualTres() {
        Assert.assertEquals("Fibonacci para n igual a três", 2, Fibonacci.calculaSequencia(3));
    }
}
