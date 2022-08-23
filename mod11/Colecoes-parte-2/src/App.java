import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        /*
         * Exemplo de entrada:
            Thiago, M
            Ana, F
            Diego, M
            Jorge, M
            Carla, F
         */

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o nome e o sexo da pessoa: ");
            String data = sc.nextLine();
            String[] pessoa = data.split(",");
            if(pessoa[1].equals("M")) {
                masculino.add(new Pessoa(pessoa[0], Character.valueOf('M')));
            } else if(pessoa[1].equals("F")) {
                feminino.add(new Pessoa(pessoa[0], Character.valueOf('F')));
            }
        }
        sc.close();
    }
}
