import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual posição da sequência de fibonnaci você quer?");
        int output = scanner.nextInt();
        int resposta = 0;

        try {
            resposta = fibonnaci(output - 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.close();
            return;
        }
        
        System.out.println("A resposta é: " + resposta);
        scanner.close();
    }

    public static int fibonnaci(int n) {
        
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
           throw new IllegalArgumentException("Índice nulo ou negativo não permitido!");
        }

        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}
