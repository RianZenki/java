/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author Nacazato
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Pedro";
        String nome2 = "Pedro";
        String nome3 = new String("Pedro");
        String res;
        
        // retorna "igual" Verifica se os dois objetos String são iguais, não só o conteudo
        res = nome1 == nome2 ? "igual" : "diferente";
        System.out.println(res);
        
        // retorna "diferente". Pq foi declarada com new, assim possui a estrutura diferente
        res = nome1 == nome3 ? "igual" : "diferente";
        System.out.println(res);
        
        // retorna "igual". Forma correta de comparação do conteudo de dois objetos
        res = nome1.equals(nome3) ? "igual" : "diferente";
        System.out.println(res);
        
    }
    
}
