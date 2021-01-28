/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncoes;

/**
 *
 * @author Nacazato
 */
public class TesteFuncoes {

    /**
     * @param args the command line arguments
     */
    
    // Metodo sem retorno, void
    public static void soma(int a, int b) {
        int s = a + b;
        System.out.println("A soma vale " + s);
    }
    
    // Metodo com retorno
    public static int soma2(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        
        int s = soma2(5, 10);
        System.out.println("A soma vale " + s);
        
        soma(5, 2);
    }
    
}
