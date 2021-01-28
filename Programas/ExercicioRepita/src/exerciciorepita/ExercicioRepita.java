/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Nacazato
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n, count = 0, par = 0, impar = 0 , acima100 = 0, soma = 0, media = 0;
        
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("<html>Digite um numero positivo. <br><em>(0 interrompe)</em></html>"));

            if (n == 0) break;
            
            if (n%2 == 0) par++;
            else impar++; 
 
            if (n>100) acima100++;
            
            count++;
            soma += n;
            media = soma/count;
            
        } while (n != 0);
        
        JOptionPane.showMessageDialog(null, "Resultado: "
                + "\n-------------"
                + "\nTotal de valores: " + count
                + "\nTotal de pares: " + par
                + "\nTotal de impares: " + impar
                + "\nAcima de 100: " + acima100
                + "\nMédia dos valores: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
