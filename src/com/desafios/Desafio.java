package com.desafios;

/*
PRograma calcula salário e imprime pro funcionário
Imposto:
0 a 1.100 = 5%
1.101 a 2.500 = 10%
Maior que 2.500 = 15% 
*/


import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu salário bruto: ");
        double salario = leitor.nextDouble();

        System.out.println("Digite o valor total do seu benefício(se tiver):");
        double beneficios = leitor.nextDouble();

        double imposto = 0;
        if (salario >= 0 && salario <= 1100){
            imposto = 0.05 * salario;
        }
        else if (salario >= 1101 && salario <= 2500){
            imposto = 0.10 * salario;
        }
        else{
            imposto = 0.15 * salario;
        }

        double salarioFinal = salario + beneficios - imposto;
        System.out.println(String.format("%.2f", salarioFinal));
        leitor.close();
    }
}
