import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Map<Integer, String> lista_pessoas = new HashMap<>();
        List<String> lista_homens = new ArrayList<>();
        List<String> lista_mulheres = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome de pessoas (separados por vírgula): ");
        String nomes = sc.nextLine();
        String[] lista_nomes = nomes.split(", "); // Exemplo: Joao, Maria, Jose, Kaka

        for(int i = 0; i < lista_nomes.length; i++) {
            lista_pessoas.put(i, lista_nomes[i]);
        }        
        
        List<String> nomes_ordenados = new ArrayList<>(lista_pessoas.values());
        Collections.sort(nomes_ordenados);

        for(int i = 0; i < nomes_ordenados.size(); i++) {
            System.out.println(nomes_ordenados.get(i));
        }

        System.out.println("************************************");
        
        System.out.println("Digite o nome e o sexo de cinco pessoas (exemplo: Joao - M): ");
        for(int i = 0; i < 5; i++) {
            String data = sc.nextLine();
            String[] nome_sexo = data.split(" - ");
            if(nome_sexo[1].equals("M")) {
                lista_homens.add(nome_sexo[0]);
            } else if (nome_sexo[1].equals("F")) {
                lista_mulheres.add(nome_sexo[0]);
            }            
        }

        sc.close();
        System.out.println();

        for(int i = 0; i < lista_homens.size(); i++) {
            System.out.println("M - " + lista_homens.get(i));
        }
        for(int i = 0; i < lista_mulheres.size(); i++) {
            System.out.println("F - " + lista_mulheres.get(i));
        }
    }        
}
