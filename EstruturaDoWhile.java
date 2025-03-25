import javax.swing.JOptionPane;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador =1;
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota1:"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota2:"));
            JOptionPane.showMessageDialog(null,"A media é:" + (nota1+nota2)/2);
            contador++;
        } while (contador<=3);
    }
}
