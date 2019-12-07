/*
 * Scrivere un programma in Java che poermetta di calcolare il perimetro, la diagonale e l'area di un rettangolo di cui l'utente fornisce le misure dei due lati in cm.
 * Il programma deve chiedere all'utente le misure dei due lati e il tipo di operazione che intende eseguire.
 * Autore: Nicolò Pierro
 * Data: 8/10/2019
 */

import java.util.Scanner;

public class Rettangolo {

    public static void main(String[] args) {
        /* 
         * Dichiarazione delle variabili
         */
        int opzione;
        double latominore;
        double latomaggiore;
        double area;
	    double perimetro;
	    double diagonale;
	    /* 
	     * Inserimento dati di input
	     */
	    Scanner dati = new Scanner(System.in);
	    System.out.println("Inserire il valore di uno dei due lati minori.");
	    latominore = dati.nextDouble();
	    System.out.println("Inserire il valore di uno dei due lati maggiori.");
	    latomaggiore = dati.nextDouble();
	    /* 
	     * Controllo dell'input 
	     */
	    if (latominore > latomaggiore) {
	        System.out.println("Errore: il valore del lato minore è maggiore del valore del lato maggiore.");
	    } else {
	        /* 
	         * se il controllo è positivo
	         */
	        System.out.println("Opzione 1: calcolo dell'area.");
	        System.out.println("Opzione 2: calcolo della diagonale");
	        System.out.println("Opzione 3: calcolo del perimetro");
	        System.out.println("Opzione 4: calcolo di tutte le misure (area, diagonale, perimetro)");
	        System.out.println("Opzione 5: nessuna operazione");
	        Scanner opzione = new Scanner(System.in);
	        System.out.println("Scegliere una tra le opzioni sopra digitando il numero dell'opzione:");
	        opzione = opzione.nextInt();
	        switch(opzione) {
	            /*
	             * Elaborazione dei dati e visualizzazione del/dei risultati
	             */
	            case 1: 
	               area = latominore * latomaggiore;
	               System.out.println("Il valore dell'area del rettangolo è: " + area + " centrimetri quadrati.");
	               break;
	            case 2:
	               diagonale = (latominore * latominore) + (latomaggiore * latomaggiore);
	               System.out.println("Il valore della diagonale del rettangolo è: " + Math.sqrt(diagonale) + " centimetri.");
	               break;
	            case 3:
	               perimetro = latominore + latominore + latomaggiore + latomaggiore;
	               System.out.println("Il valore del perimetro è: " + perimetro + " centrimetri");
	               break;
	            case 4:
	               area = latominore * latomaggiore;
	               diagonale = (latominore * latominore) + (latomaggiore * latomaggiore);
	               perimetro = latominore + latominore + latomaggiore + latomaggiore;
	               System.out.println("Il valore dell'area del rettangolo è: " + area + " centimetri quadrati.");
	               System.out.println("Il valore della diagonale del rettangolo è: " + diagonale + " centrimetri.");
	               System.out.println("Il valore del perimetro è: " + perimetro + " centimetri");
	               break;
	            case 5:
	               System.out.println("Nessuna operazione verrà eseguita.");    
	               break;
	            default: 
	               System.out.println("Il numero inserito non corrisponde a nessuna opzione.");
	               break;
	        } 
            dati.close();
            opzione.close();
	    }
	    
    }
}