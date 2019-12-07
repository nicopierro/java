// Modificare il programma precedente per calcolare non solo l’ammontare della spesa ma anche i punti Fidaty che il cliente deve ricevere.

// autore: Nicolò Pierro

// data: 30/10/2019



// import delle librerie necessarie
import java.util.Scanner;
public class ScontoPiuFidaty {


    public static void main(String[] args) {

        // dichiarazione delle variabili
        double spesa = 0, sconto = 0;
        double spesatot = 0;
        double punti = 0;
        Scanner tastiera = new Scanner (System.in);

        // input dei dati
        System.out.println("Inserire l'importo della spesa:");
        spesa = tastiera.nextDouble();


        // elaborazione dei dati inseriti dall'utente
        if (spesa < 10) {
            sconto = 0;
        } else if (spesa >= 10 && spesa < 30) {
            sconto = spesa * 10 / 100;
        } else if (spesa >= 30 && spesa < 70) {
            sconto = spesa * 15 / 100;
        } else {
            sconto = spesa * 20 / 100;
        }

        if (spesa > 5){
            punti = (spesatot - 5) * 2;
        }
        // visualizzazione risultato
        System.out.println("Devi pagare " + spesatot + "€");
        System.out.println("I punti Fidaty accumulati sono " + punti);
        
        tastiera.close();
    }

}
