// Modificare il programma dell'esercizio 3 in modo tale da visualizzare anche la somma dei numeri della sequenza.
// Autore: Nicolò Pierro
// 18/10/2019

// import delle librerie necessarie

import java.util.Scanner;


public class Sequenza4 {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        int nsequenza, i, n, somma = 0;
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il valore di n:");
        n = tastiera.nextInt();
        // elaborazione dei dati inseriti dall'utente 
        for (i = 1; i <= n; i++) {
            nsequenza = i * i + 1;
            // visualizzazione del risultato
            if (n >= 0) {
                System.out.println(nsequenza + " ");
            } else {
                System.out.println(-nsequenza + " ");
            }
            somma = somma + nsequenza;
            System.out.println("La somma dei numeri della sequenza è: " + somma);
            
            }
        
        tastiera.close();	    
    }
}
