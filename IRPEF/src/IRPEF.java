/*
 * Scrivere un programma Java che permetta ad una persona di calcolare quanto deve pagare di IRPEF.
 * L’utente inserisce il proprio reddito in euro e il programma calcola il valore della tassa da pagare e risponde
 * con il messaggio esplicativo. Nel caso dell’esempio, il programma risponderà con il messaggio: “Il tuo
 * reddito ricade nello scaglione n° 3 (da 280001 € a 55000 €) e le imposte da pagare sono pari a 7720 €”.
 */
// Nicolò Pierro
// 9/10/2019

// import delle librerie necessarie 
import java.util.Scanner;

public class IRPEF {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        double reddito;
        double imposta;
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il proprio reddito complessivo in euro:");
        reddito = tastiera.nextDouble();
        // elaborazione dei dati inseriti dall'utente
        // visualizzazione del risultato
        if (reddito < 0) {
            System.out.println("L'IRPEF non può essere applicato a redditi negativi.");
        } else if (reddito >= 0 && reddito <= 15000) {
            imposta = reddito * 23 / 100;
            System.out.println("Il tuo reddito ricade nello scaglione n° 1 (da 0 € a 15000 €) e le imposte da pagare sono pari a " + imposta + " €.");
        } else if (reddito >= 15001 && reddito <= 28000) {
            imposta = (reddito - 15000) * 27 / 100 + 3450;
            System.out.println("Il tuo reddito ricade nello scaglione n° 2 (da 15001 € a 28000 €) e le imposte da pagare sono pari a " + imposta + " €.");
        } else if (reddito >= 28001 && reddito <= 55000) {
            imposta = (reddito - 28000) * 38 / 100 + 6960;
            System.out.println("Il tuo reddito ricade nello scaglione n° 3 (da 28001 € a 55000 €) e le imposte da pagare sono pari a " + imposta + " €.");
        } else if (reddito >= 55001 && reddito <= 75000) {
            imposta = (reddito - 55000) * 41 / 100 + 17220;
            System.out.println("Il tuo reddito ricade nello scaglione n° 4 (da 55001 € a 75000 €) e le imposte da pagare sono pari a " + imposta + " €.");
        } else if (reddito > 75000) {
            imposta = (reddito - 75000) * 43 / 100 + 25420;
            System.out.println("Il tuo reddito ricade nello scaglione n° 5 (oltre 75000€) e le imposte da pagare sono pari a " + imposta + " €.");
        }
	   
	   tastiera.close();
	        
	}
	    
}

