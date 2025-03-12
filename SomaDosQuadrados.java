import java.util.Scanner;

public class SomaDosQuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaDosQuadrados = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            somaDosQuadrados += numero * numero;
        }

        scanner.close();
        System.out.println("A soma dos quadrados é: " + somaDosQuadrados);
    }
}
