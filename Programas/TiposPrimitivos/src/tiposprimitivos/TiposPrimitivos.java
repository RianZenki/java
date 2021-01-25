package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        String nome;
        float nota;
        
        System.out.print("Digite o nome do aluno: ");
        nome = teclado.nextLine();
        
        System.out.print("Digite a nota do aluno: ");
        nota = teclado.nextFloat();
        
        System.out.print("A nota é " + nota + "\n");
        System.out.println("A nota é " + nota);
        
        System.out.printf("A nota de %s é %.2f\n", nome, nota);
        System.out.format("A nota de %s é %.1f\n", nome, nota);
    }
    
}