import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> lista = Pessoa.listaPessoas().stream().collect(Collectors.toList());

        System.out.print("Digite a quantidade de pessoas a serem inseridas: ");
        int pessoas = Integer.parseInt(System.console().readLine());

        System.out.println("Digite os dados da pessoa (Nome,Sexo). Exemplo: Maria,F");
        for (int i = 0; i < pessoas; i++) {
            lista.add(Pessoa.stringToPessoa(System.console().readLine()));
        }

        Stream<Pessoa> stream = lista.stream()
                .filter(p -> Character.toString(p.getSexo()).equals("F"));
        stream.forEach(p -> System.out.println(p.toString()));

    }
}
