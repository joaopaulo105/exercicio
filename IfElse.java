import javax.swing.JOptionPane;

public class IfElse {
    public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        }
            else {
                JOptionPane.showMessageDialog(null, "Reprovado");
            
        }
    }
}
