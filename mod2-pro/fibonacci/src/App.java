public class App {
    public static void main(String[] args) throws Exception {

        int entrada = 65;

        long inicioRec = System.nanoTime();
        long rec = Fatorial.fatorialRecursivo(entrada);
        long tempoRec = System.nanoTime() - inicioRec;

        long inicioTD = System.nanoTime();
        long td = Fatorial.fatorialPDTD(entrada);
        long tempoTD = System.nanoTime() - inicioTD;

        long inicioBU = System.nanoTime();
        long bu = Fatorial.fatorialPDBU(entrada);
        long tempoBU = System.nanoTime() - inicioBU;

        long inicioSeq = System.nanoTime();
        long seq = Fatorial.fatorialSequencial(entrada);
        long tempoSeq = System.nanoTime() - inicioSeq;

        System.out.println("Fatorial usando algoritmo sequencial:                 " + seq + ", Tempo decorrido: " + tempoSeq + " nanossegundos");
        System.out.println("Fatorial usando algoritmo recursivo simples:          " + rec + ", Tempo decorrido: " + tempoRec + " nanossegundos");
        System.out.println("Fatorial usando algoritmo resursivo com PD top down:  " + td + ", Tempo decorrido: " + tempoTD + " nanossegundos");
        System.out.println("Fatorial usando algoritmo resursivo com PD botton up: " + bu + ", Tempo decorrido: " + tempoBU + " nanossegundos");

    }
}
