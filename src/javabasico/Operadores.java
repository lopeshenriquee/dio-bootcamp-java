package javabasico;

public class Operadores {
    public static void main(String[] args) {
        double soma = 10.5 + 15.5;
        int subtracao = 113 - 12;
        int multiplicacao = 12 * 45;
        int divisao = 20 / 4;
        int modulo = 17 % 3;
        double r = (10 * 7) + (20/4);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(r);
        
        //+ CONCATENAÇÃO
        String nomeCompleto = "Linguagem" + " Java";
        System.out.println(nomeCompleto);


        //OPERADOR TERNÁRIO

        /*
         *if (a==b)
         *      resultado = "Verdadeiro";
         *else
         *      resultado = "false";
         */

        int a, b;
        String resultado;

        a = 5;
        b = 6;

        resultado = a==b ?"vdd" : "false";
        System.out.println(resultado);

        /* OPERADORES LÓGICOS
            && Operador Lógico 'E' 
            || Operador Lógico 'OU'
        */
    }
}