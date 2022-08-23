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

        double media = Media.media_4notas(a, b, c, d);

        if(media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Aluno em recuperação");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
