import java.util.Arrays;

public class SistemaTroco {

    public interface Caixa {
        int[] getMoedasDisponiveis();

        int getValorTotal();
    }

    public static class TesteCaixa implements Caixa {

        @Override
        public int[] getMoedasDisponiveis() {
            return new int[] { 5, 2, 1 };
        }

        @Override
        public int getValorTotal() {
            return 18;
        }
    }

    public int getMinimoMoedas(final Caixa caixa) {

        int valor = caixa.getValorTotal();
        int[] moedas = caixa.getMoedasDisponiveis();
        Arrays.sort(moedas);
        int qtdeMoedas = 0, indice = moedas.length-1;

        while(true) {
            if(indice == 0) {
                if(valor - moedas[0] >= 0) {
                    qtdeMoedas++;
                    valor -= moedas[0];
                } else {
                    return qtdeMoedas;
                }
            } else {
                if(valor - moedas[indice] >= 0) {
                    valor -= moedas[indice];
                    qtdeMoedas++;
                } else {
                    indice--;
                }
            }
        }
    }

    public static void main(String[] args) {
        SistemaTroco sistemaTroco = new SistemaTroco();
        Caixa caixa = new TesteCaixa();

        System.out.println(sistemaTroco.getMinimoMoedas(caixa));
    }
}
