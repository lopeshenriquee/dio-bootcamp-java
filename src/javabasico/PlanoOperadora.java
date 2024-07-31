package javabasico;

public class PlanoOperadora {
    public static void main(String[] args) {
        // Basic - Medium - Avanced
        String plano = "Medium";

        switch (plano) {
            case "Basic":
                System.out.println("Seu Plano é o " + plano + " - 5Gb Youtube");
                break;
            case "Medium":
                System.out.println("Seu Plano é o " + plano + " - Whatsapp e Instagram Ilimitado");
                break;
            case "Avanced":
                System.out.println("Seu Plano é o " + plano + " - 5Gb Youtube + Whatsapp e Instagram Ilimitado");
                break;
        
            default:
                break;
        }

    }
}
