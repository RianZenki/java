
package primeiroprograma;

import java.awt.Dimension;
import java.awt.Toolkit;

public class TamanhoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("Tamanho da tela: " +d.width + " x " +d.height);
    }
}
