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
public class Vetor3 {
    
    public static void main(String[] args) {
        
        /* 
        Utilizando o for each.
        
        Forma geral:
        for (tipo varaivel: matriz){
        }
        
        Funciona somente para vetores.
        Passa de indice em indice do vetor e 
        a variavel criada, recebe o valor do indice.
        
        O tipo da variavel criada dentro do for each precisa ser
        igual do tipo do vetor
        
        */
        
        double v[] = {3.5, 2.75, 9, -4.5};
        
        // Ordenando o vetor
        Arrays.sort(v);
        
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }

}
