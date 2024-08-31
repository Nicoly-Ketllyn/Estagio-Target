import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar se pertence a sequência: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1;
        int fibonacci = 0;

        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence sequência.");
            return;
        }

        while (fibonacci < numero) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        if (fibonacci == numero) {
            System.out.println("O número " + numero + " pertence a sequência.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência.");
        }
        
        scanner.close();
    }
}
