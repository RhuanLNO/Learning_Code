//salvar como programa04.java
import javax.swing.JOptionPane;

class programa04
{
    public static void main(String Entrada[]) 
    {
        //declaração de variáveis
        int n1, n2, div;
        double pot;
        String msg = "";
        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        //processamento
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1, n2);
        //saída de dados
        msg = msg + "quociente de divisão de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + "potencia de " + n1 + " por " + n2 + " = " + pot + "\n";
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}