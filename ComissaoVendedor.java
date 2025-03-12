import java.util.Scanner;

public class ComissaoVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o preço unitário da peça
        System.out.print("Digite o preço unitário da peça: ");
        double precoUnitario = scanner.nextDouble();
        
        // Solicita a quantidade vendida
        System.out.print("Digite a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();
        
        // Calcula o total da venda
        double totalVenda = precoUnitario * quantidadeVendida;
        
        // Calcula a comissão (5% do total da venda)
        double comissao = totalVenda * 0.05;
        
        // Exibe o resultado
        System.out.printf("O valor da comissão é: R$ %.2f%n", comissao);
        
        scanner.close();
    }
}