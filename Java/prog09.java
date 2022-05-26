//salvar como prog09.java
import javax.swing.*;

class prog09
{
    public static void soma(int vet[]) 
    {
        int s=0;
        
        for (int i = 0; i<vet.length; i++)
        {
            s = s + vet [i];
        }

        JOptionPane.showMessageDialog(null, "A somatória é " + s);
    }

    public static int produto(int vet[]) 
    {
        int p=1;
        
        for (int i=0; i<vet.length; i++)
        {
            p = p * vet [i];
        }

        return p;
    }

    public static void main(String[] args) 
    {
        int r, vetor[] = {1, 3, 5, 7, 9};
        int s=0;
        
        soma(vetor);
        r = produto(vetor);
        JOptionPane.showMessageDialog(null, "A produtória é " + r);
        System.exit(0);
    }
}
