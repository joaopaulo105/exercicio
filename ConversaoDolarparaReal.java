import java.util.Scanner;

public class ConversaoDolarparaReal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a cotação do dólar:");
        double cotacaoDolar = sc.nextDouble();
        System.out.print("Digite a quantidade de dólares:");
        double quantidadeDolares = sc.nextDouble();
        double valorEmReais = cotacaoDolar * quantidadeDolares;
        System.out.println("O valor de " + quantidadeDolares + " dólares é R$ " + valorEmReais);
        sc.close();
    }
}
