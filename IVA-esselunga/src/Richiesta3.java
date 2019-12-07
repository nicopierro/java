/* Modificare opportunamente il programma precedente per permettere di inserire anche i prodotti “Sconto Facile”, 
/  cioè dei prodotti su cui l’Esselunga sconta direttamente 1 €. 
/  Al termine, al totale deve essere tolto il totale degli sconti.
*/

// Autore: Nicolò Pierro

// 30/10/2019

// import delle librerie necessarie
import java.util.Scanner;

public class Richiesta3 {
    public static void main(String[] args) {
        // dichiarazione delle variabili
        double spesa = 1, IVA = 0, totale = 0, IVA4 = 0, IVA10 = 0, IVA22 = 0;
        int scontofacile = 0;
        char categoria = ' ';
        boolean checkscontofacile = false;
        
        Scanner tastiera = new Scanner(System.in);  
        
        // input dei dati
        // elaborazione dei dati inseriti dall'utente
        while (spesa != 0) {
            System.out.println("Inserire 0 sia al prezzo che alla categoria per terminare l'inserimento dei prodotti");
            System.out.println("Inserire il prezzo del prodotto (IVA inclusa)");
            spesa = tastiera.nextDouble();
            System.out.println("Inserire la categoria del prodotto (A, B o C)");
            categoria = tastiera.next().charAt(0);
            if (spesa != 0 && categoria != '0' && (categoria == 'A' || categoria == 'a' || categoria == 'B' || categoria == 'b' || categoria == 'C' || categoria == 'c')) {
            System.out.println("E' un prodotto Sconto Facile? (Scrivere 'true' o 'false'");
            checkscontofacile = tastiera.nextBoolean();
            }

            
            totale += spesa;
            if (checkscontofacile = true) {
                scontofacile += 1;
                checkscontofacile = false;
            }
            switch(categoria) {
                case 'a':
                case 'A':
                IVA = spesa * 4 / 100;
                IVA4 += IVA;
                break;
                case 'b':
                case 'B':
                IVA = spesa * 10 / 100;
                IVA10 += IVA;
                break;
                case 'c':
                case 'C':
                IVA = spesa * 22 / 100;
                IVA22 += IVA;
                break;
                default:
                System.out.println("Categoria non prevista");
            }
            
            
        }           
        
        totale -= scontofacile;
        // visualizzazione del risultato
        if (IVA > 0 && spesa == 0 && categoria == '0') {
            System.out.println("Il totale della spesa è di: " + totale + " di cui " + IVA4 + " € IVA al 4%, " + IVA10 + " € IVA al 10% e " + IVA22 + " € IVA al 22%");
        }

        tastiera.close();
    }
}