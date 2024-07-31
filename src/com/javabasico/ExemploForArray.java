package com.javabasico;

public class ExemploForArray {
    public static void main(String[] args) {
        //array inicia em 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x< alunos.length; x++){
            System.out.println("O aluno no índice: " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos) {
            System.out.println("Nome do Aluno: " + aluno);
        }
    }
}
