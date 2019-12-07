// memoria libera inserita dall'utente
// foto da scattare inserite dell'utente
// visualizzare memoria libera al termine

import java.util.Scanner;

public class TestSmartphone2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire la dimensione della memoria del proprio telefono in GB:");
        double memoriaLibera = tastiera.nextDouble();
        System.out.println("Inserire il numero di foto da scattare:");
        int numFoto = tastiera.nextInt();
        
        memoriaLibera = memoriaLibera * 1024;
        
        Smartphone s1 = new Smartphone(memoriaLibera);
        for (int i = 0; i < numFoto; i++) {
            s1.scattaFoto();
        }
        
        System.out.println("Memoria libera: " + s1.memoriaLibera / 1024 + " GB");
        
    }

}