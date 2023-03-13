import java.util.List;

/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private char sexo;

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static List<Pessoa> listaPessoas() {
        Pessoa p1 = new Pessoa("Maria", 'F');
        Pessoa p2 = new Pessoa("Ana", 'F');
        Pessoa p3 = new Pessoa("Clara", 'F');
        Pessoa p4 = new Pessoa("Cristina", 'F');
        Pessoa p5 = new Pessoa("Serafina", 'F');
        Pessoa p6 = new Pessoa("Sara", 'F');
        Pessoa p7 = new Pessoa("Pedro", 'M');
        Pessoa p8 = new Pessoa("Alencar", 'M');
        Pessoa p9 = new Pessoa("Romualdo", 'M');
        Pessoa p10 = new Pessoa("Silvino", 'M');
        Pessoa p11 = new Pessoa("Luiz", 'M');
        Pessoa p12 = new Pessoa("João", 'M');
        return List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12);
    }

    public static Pessoa stringToPessoa(String entrada) {
        String[] dados = entrada.split(",");
        String nome = (dados[0]);
        char sexo = dados[1].toUpperCase().charAt(0);
        return new Pessoa(nome, sexo);
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
    }
}