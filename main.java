import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        System.out.println("Vamos a crear un programa para adivinar un nmero");


            int numeroAdivinar = 7;
            boolean adivinado = false;
            int numeroIntroducido = 0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce un numero del 1 y 10");
            while (adivinado == false){
                numeroIntroducido = scanner.nextInt();
                if(numeroIntroducido == numeroAdivinar){
                    System.out.println("Adivinaste el numero");
                    adivinado = true;
                }else{
                    System.out.println("No adivinaste, intenta de nuevo");
                }
            }
    }
}

