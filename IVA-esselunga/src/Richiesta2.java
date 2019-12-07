/* Scrivere un programma che permetta di inserire più prodotti e di calcolare il totale e l’IVA delle varie categorie.
/  Il programma accetta prezzi e categorie dei prodotti fino a quando l’utente non inserisce il valore 0. 
/  A qual punto il programma deve visualizzare il totale da pagare e l’IVA delle varie categorie con un messaggio.
*/ 


// Autore: Nicolò Pierro

// 30/10/2019

// import delle librerie necessarie
import java.util.Scanner;

public class Richiesta2 {
    public static void main(String[] args) {
        // dichiarazione delle variabili
        double spesa = 1, IVA = 0, totale = 0, IVA4 = 0, IVA10 = 0, IVA22 = 0;
        char categoria = ' ';
        
        Scanner tastiera = new Scanner(System.in);  
        
        // elaborazione dei dati inseriti dall'utente
        while (spesa != 0) {
            System.out.println("Inserire 0 sia al prezzo che alla categoria per terminare l'inserimento dei prodotti");
            System.out.println("Inserire il prezzo del prodotto (IVA inclusa)");
            spesa = tastiera.nextDouble();
            System.out.println("Inserire la categoria del prodotto (A, B o C)");
            categoria = tastiera.next().charAt(0);
            totale += spesa;
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

        // visualizzazione del risultato
        if (IVA > 0 && spesa == 0 && categoria == '0') {
            System.out.println("Il totale della spesa è di: " + totale + " di cui " + IVA4 + " € IVA al 4%, " + IVA10 + " € IVA al 10% e " + IVA22 + " € IVA al 22%");
        }

        tastiera.close();
    }
}