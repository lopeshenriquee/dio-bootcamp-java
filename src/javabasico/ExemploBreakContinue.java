package javabasico;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero++){
            if (numero == 3)
                continue; //não passa para o sysout

            System.out.println(numero);    
        }
    }
}
