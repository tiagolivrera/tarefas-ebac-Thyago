package com.tiagolivrera;

public class Fibonacci {
    
    public static long calculaSequencia(int n) {
        if (n < 2) {
            return n;
        } else {
            return calculaSequencia(n - 1) + calculaSequencia(n - 2);
        }
    }
}
