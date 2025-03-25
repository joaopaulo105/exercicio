import javax.swing.JOptionPane;

public class ExibeNumeros {
    public static void main(String[] args) {
        String saida ="";
        int contador=1; 
        for (contador= 1; contador <=100; contador++){
            saida = saida + contador + ",";
        }
        StringBuilder numeros = new StringBuilder();
            numeros.append(contador).append("\n");
            JOptionPane.showMessageDialog(null,saida, "Primeiros 100 numeros naturais", JOptionPane.INFORMATION_MESSAGE);
        }
    }

