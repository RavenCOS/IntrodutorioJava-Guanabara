package guanabara.introdutorio.java;

import java.awt.*;
import java.util.Date;
import java.util.Locale;


public class Sistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio);
        Locale idioma = Locale.getDefault();
        System.out.print("Seu sistema está em: ");
        System.out.println(idioma);
        Dimension resolucao = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println(resolucao);

    }
}
