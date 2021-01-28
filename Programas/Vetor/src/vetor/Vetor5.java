/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Arrays;

/**
 *
 * @author Nacazato
 */
public class Vetor5 {
    
    public static void main(String[] args) {
        
        int v[] = new int[20];
        
        // Preencher todo um vetor com o mesmo valor
        Arrays.fill(v, 7);
        
        for (int valor: v) {
            System.out.print(valor + " ");
        }
        System.out.println("");
        
    }
    
}
