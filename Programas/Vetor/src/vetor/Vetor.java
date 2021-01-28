/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

/**
 *
 * @author Nacazato
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Declarando um vetor de inteiros
        int[] v = new int[4];
        int c;
        
        // Declarando e populando um vetor;
        int n[] = {3, 2, 5, 7, 6};
        
        // Passando pelo vetor
        for(c=0; c<5; c++){
            System.out.print(n[c] + " ");
        }
        System.out.println("");
        
        // Utilizando um metodo do objeto n
        System.out.println("Tamanho do vetor N: " + n.length);
        
        for (c=0; c<n.length; c++){
            System.out.print(n[c] + " ");
        }
        System.out.println("");
    }
    
}
