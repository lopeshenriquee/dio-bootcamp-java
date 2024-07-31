package javabasico;

import java.text.NumberFormat;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}