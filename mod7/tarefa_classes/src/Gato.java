public class Gato {
    /*
     * Classe que representa um gato
     * versao: 1.0
     */
    public String nome;         // nome do gato
    public Integer idade;       // idade do gato

    // metodo que faz o gato voar
    public void miar() {
        System.out.println("miar(): Miau");
    }

    // metodo que faz o gato andar
    public void andar() {
        System.out.println("andar(): Andando...");
    }

    // metodo que faz o gato voar (ou quase)
    public void voar() {
        System.out.println("voar(): ERRO! Ainda não suporto essa função :(");
    }
}
