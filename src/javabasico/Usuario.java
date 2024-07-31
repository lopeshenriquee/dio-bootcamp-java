package javabasico;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTV smartv = new SmartTV();

        System.out.println("TV ligada? " + smartv.ligada);
        System.out.println("Canal Atual: " + smartv.canal);
        System.out.println("Volume Atual: " + smartv.volume);

        smartv.ligar();
        System.out.println("Novo Status - TV ligada? " + smartv.ligada);

        smartv.desligar();
        System.out.println("Novo Status - TV ligada? " + smartv.ligada);

        smartv.mudarCanal(35);
        smartv.diminuirCanal();
        System.out.println("Novo Status - Canal Atual: " + smartv.canal);

        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.diminuirVolume();
        smartv.aumentarVolume();
        System.out.println("Novo Status - Volume Atual: " + smartv.volume);
    }
}
