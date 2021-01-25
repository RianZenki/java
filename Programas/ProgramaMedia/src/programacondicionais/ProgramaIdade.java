/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacondicionais;

import java.util.Scanner;

/**
 *
 * @author Nacazato
 */
public class ProgramaIdade {
    
    public static void main(String[] args) {
        
        System.out.print("Digite o ano de nascimento: ");
        Scanner s = new Scanner(System.in);
        
        int nasc = s.nextInt();
        int i = 2021 - nasc;
        
        System.out.println("Sua idade é " + i);
        
        if (i >= 18) {
            System.out.println("Maior");
        }
        else {
            System.out.println("Menor");
        }
    }
}
