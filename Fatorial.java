import java.util.Scanner;

public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }else{
            return n* fatorial(n- 1);

        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Digite um numero natural: ");
            int numero = scanner.nextInt();
            if (numero <0){
            }else{
                int resultado = fatorial(numero);
                System.out.println("O fatorial de " + numero + " é " + resultado + ".");
            }
            scanner.close();
        }

    }

