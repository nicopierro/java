// Modificare il programma dell'esercizio 1 in modo tale che se l'utente inserisce un numero negativo la sequenza viene visualizzata con i numeri cambiati di segno.
// Autore: Nicolò Pierro
// 18/10/2019

// import delle librerie necessarie

import java.util.Scanner;


public class Sequenza3 {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        int nsequenza, i, n;
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il valore di n:");
        n = tastiera.nextInt();
        // elaborazione dei dati inseriti dall'utente 
        for (i = 1; i <= n; i++) {
            nsequenza = i * i + 1;
            // visualizzazione del risultato
            if (n >= 0) {
                System.out.print(nsequenza + " ");
            } else if (n < 0) {
                System.out.print(-nsequenza + " ");
            }
        }
        
        tastiera.close();	    
    }
}
