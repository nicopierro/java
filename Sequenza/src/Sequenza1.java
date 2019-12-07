// Scrivere un programma Java che visualizzi i primi n numeri di questa sequenza (1, 2 , 5, 10, 17, 26, 37, 50...) con n inserito dall'utente.
// Autore: Nicolò Pierro
// 18/10/2019

// import delle librerie necessarie

import java.util.Scanner;


public class Sequenza1 {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        int nsequenza, i, n;
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il valore di n:");
        n = tastiera.nextInt();
        // elaborazione dei dati inseriti dall'utente 
        for (i = 0; i < n; i++) {
            nsequenza = i * i + 1;
            // visualizzazione del risultato
            System.out.print(nsequenza + " ");
        }
        
        tastiera.close();	    
    }
}
