// Scrivere un programma java che permetta all’utente di inserire l’importo della spesa e di avere quanto deve effettivamente pagare

// Autore: Nicolò Pierro

// 30/10/2019

// import delle librerie necessarie
import java.util.Scanner;

public class Sconto {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        Scanner tastiera = new Scanner(System.in);
        double spesa = 0, sconto = 0, daPagare;
        
        // input dei dati
        System.out.println("Benvenuto! Inserisci il valore della tua spesa :)");
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
        
        daPagare = spesa - sconto;
        
        // visualizzazione del risultato
        System.out.println("Quello che devi pagare è: " + daPagare);
        
        tastiera.close();
    }
}
