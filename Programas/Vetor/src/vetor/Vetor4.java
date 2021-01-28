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
public class Vetor4 {
    
    public static void main(String[] args) {
        
        int vet[] = {3, 7, 1, 9, 4, 2};
        
        // Ordenando o vetor
        Arrays.sort(vet);
        
        for (int valor: vet){
            System.out.print(valor + " ");
        }
        System.out.println("");
        
        // Procurando o 4 utilizando a procura binária
        int p = Arrays.binarySearch(vet, 4);
        System.out.println("Encontrei o valor na posição " + p);
        
        // Procurando um valor inexistente no vetor.
        // Retorna um numero negativo.
        p = Arrays.binarySearch(vet, 20);
        System.out.println("Encontrei o valor na posição " + p);
        
    }
    
}
