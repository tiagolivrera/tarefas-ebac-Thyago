public class Fatorial {

    private static final int MAX_SIZE = 200;
    private static final long lista[] = new long[MAX_SIZE];

    public static long fatorialSequencial(int n) {
        long res = 1;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
        }
        return res;
    }

    public static long fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return (long) n * fatorialRecursivo(n - 1);
    }

    // fatorial utilizando programacao dinamica com abordagem botton up
    public static long fatorialPDBU(int n) {
        for (int i = 0; i < MAX_SIZE; i++) {
            lista[i] = 1;
        }

        return fatorialTabulacao(n);
    }

    private static long fatorialTabulacao(int n) {
        if (lista[n] == 1) {
            if (n <= 1) {
                return lista[n];
            } else {
                lista[n] = n * fatorialTabulacao(n - 1);
            }
        }
        return lista[n];
    }

    private static long fatorialMemoizacao(int n) {
        if (n <= 1) {
            return 1;
        }
        if (lista[n] != 1) {
            return lista[n];
        }
        return lista[n] = n * fatorialMemoizacao(n - 1);
    }

    // fatorial utilizando programacao dinamica com abordagem top down
    public static long fatorialPDTD(int n) {
        for (int i = 0; i < MAX_SIZE; i++) {
            lista[i] = 1;
        }

        return fatorialMemoizacao(n);
    }

}