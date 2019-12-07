/* Programma per la divisione di due numeri inseriti dall'utente
 * I due numeri sono interi 
 * Si vuole calcolare il quoziente e il resto
 * Autore: Nicolò Pierro
 * Data: 7/10/2019
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        /* Dichiarazione delle variabili
         * 
         */
        int divisore;
        int dividendo;
        int quoziente;
        int resto;
        
	    /* Inserimento dati di input
	     * 
	     */
	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserisci il dividendo");
	    dividendo = tastiera.nextInt();	
	    System.out.println("Inserisci il divisore");
	    divisore = tastiera.nextInt();
	    
	    /* Controllo dell'input
	     * 
	     */
	    if (divisore == 0) {
	        System.out.println("La divisione non è possibile");
	    } else {
	        /* Elaborazione dei dati
	         * se il controllo è positivo
	         */
	        quoziente = dividendo / divisore;
	        resto = dividendo % divisore;
	        /* Visualizzazione del risultato
	         * 
	         */
	        System.out.println("La divisione tra " + dividendo + " e " + divisore + " da come quoziente " + quoziente + " e come resto " + resto);
	    }
	    
	    tastiera.close();

    }
}
