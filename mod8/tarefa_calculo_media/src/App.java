import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double a, b, c, d;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota: ");
        a = sc.nextDouble();
        System.out.print("Digite uma nota: ");
        b = sc.nextDouble();
        System.out.print("Digite uma nota: ");
        c = sc.nextDouble();
        System.out.print("Digite uma nota: ");
        d = sc.nextDouble();
        sc.close();

        System.out.println("Média das notas 5.0, 6.0, 7.0 e 8.0: " + Media.media_4notas(a, b, c, d));
    }
}
