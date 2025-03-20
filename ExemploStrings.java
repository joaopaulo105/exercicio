import javax.swing.JOptionPane;

public class ExemploStrings {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome?");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual e o seu peso em kg?"));
                
                // concatenando com o operador +
            JOptionPane.showMessageDialog(null,"Oi, " + nome + ". Você tem " + idade + " anos e seu peso é " + peso + "kg.");
                
                // "montando a string com o método format"
                String s = String.format("Oi, %s. Você tem %d anos e seu peso e %.2f kg.",
                        nome, idade, peso);
                JOptionPane.showMessageDialog(null, s);
            }
        }
