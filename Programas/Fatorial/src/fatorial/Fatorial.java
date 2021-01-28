/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

/**
 *
 * @author Nacazato
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FuncaoFatorial f = new FuncaoFatorial();
        
        f.setValor(5);
        System.out.print(f.getForumla());
        System.out.println(f.getfatorial());
        
        int x, y;
        double z;
        
        x = 5; y = 2;
        z = x/2;
        
        System.out.println(z);
        
    }
    
}
