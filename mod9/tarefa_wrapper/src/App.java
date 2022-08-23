import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        a = sc.nextInt();
        sc.close();

        Integer A = a;

        System.out.println("Boxing da variavel a: " + A);
    }
}
