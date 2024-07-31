package javabasico;


public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        //Tipos primitivos
        byte idade = 123;
        System.out.println(idade);
        short ano = 2021;
        System.out.println(ano);
        int cep = 11122281; 
        System.out.println(cep);
        long cpf = 98765432109L;
        System.out.println(cpf);
        float salarioMinino = 2500f;
        System.out.println(salarioMinino);
        double salarioMaximo = 2500.33;
        System.out.println(salarioMaximo);

        String nome = "Henrique";
        System.out.println(nome);

        //final usado para consoante
        final int NUMERO = 2;
        
        System.out.println(NUMERO);
    }
}