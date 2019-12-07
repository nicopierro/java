// modificare TestTermometro2 per:
// creare 5 vettori termometri senza valore all'attributo
// far inserire all'utente i 5 valori
// visualizzare le 5 temperature
// visualizzare la media delle temperature in F e K
// Autore: Nicolò Pierro
// Data: 18/11/2019

import java.util.Scanner;

public class TestTermometro3 {
    public static void main(String[] args) {
        final int numeroTermometri = 5;
        double tempC = 0;
        double tempF = 0;
        double tempK = 0;

        Scanner tastiera = new Scanner(System.in);

        Termometro[] termometri = new Termometro[numeroTermometri];

        for (int i = 0; i < 5; i++) {
            termometri[i] = new Termometro();
        }

        for (int i = 0; i < numeroTermometri; i++) {
            System.out.println("Inserisci il valore della temperatura in °C del termometro " + (i + 1));
            termometri[i].setTemperatura(tastiera.nextDouble());
        }

        System.out.println("Le temperature dei 5 termometri sono:");

        for (int i = 0; i < numeroTermometri; i++) {
            // Visualizzazione delle temperature
            System.out.println(termometri[i].getTemperatura() + " °C");
        }
        
        double somma = 0;
        
        for (int i = 0; i < numeroTermometri; i++) {
            // Accumulatore
            somma = somma + termometri[i].getTemperatura();
        }
        
        double media = somma / 5;
        
        Termometro termometroMedia = new Termometro(media);

        System.out.println("La media delle temperature corrisponde a " + (termometroMedia.getFahrenheit(media)) + " °F e a " + (termometroMedia.getKelvin(media)) + " °K");

        tastiera.close();

    }

}
