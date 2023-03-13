import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> lista = Pessoa.listaPessoas();

        Stream<Pessoa> stream = lista.stream()
                .filter(p -> Character.toString(p.getSexo()).equals("F"));
        stream.forEach(p -> System.out.println(p.toString()));

    }
}
