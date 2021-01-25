
package primeiroprograma;

import java.util.Locale;

public class IdiomaDoSistema {

    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        System.out.println("Idioma do sistema: " + idioma.getDisplayLanguage());
    }
}
