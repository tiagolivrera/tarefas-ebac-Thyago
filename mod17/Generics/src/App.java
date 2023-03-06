import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Hyundai("HB20", 2021);
        Carro c2 = new Toyota("Etios", 2019);
        Carro c3 = new Wolksvagen("Polo", 2022);

        List<Carro> lista = new ArrayList<>();
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);

        for (Carro carro : lista) {
            System.out.println(carro);
        }

    }
}
