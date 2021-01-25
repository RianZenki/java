package tiposprimitivos;

public class TesteTipos {
    
    public static void main(String[] args) {
        
        /* Convertento int para string
        int idade = 20;
        String valor = Integer.toString(idade);
        
        System.out.println(valor);
        */
        
        String valor = "30";
        int idade = Integer.parseInt(valor);
        
        System.out.println(valor);
        
        String dado = "5.6";
        float nota = Float.parseFloat(dado);
        
        System.out.println(dado);
    }
    
}
