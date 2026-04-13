import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        System.out.println("=============================");

        if (numero > 0) {
            System.out.println("  O número " + numero + " é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("  O número " + numero + " é NEGATIVO.");
        } else {
            System.out.println("  O número digitado é ZERO.");
        }

        System.out.println("=============================");

        scanner.close();
    }
}
