// Scrivere un programma che accetti il prezzo finale del prodotto, la sua categoria, scorpori l'IVA dal presso e visualizzi il prezzo senza IVA e la categoria.

// Autore: Nicolò Pierro

// 30/10/2019

// import delle librerie necessarie
import java.util.Scanner;

public class Richiesta1 {
    public static void main(String[] args) {
        // dichiarazione delle variabili
        double spesa = 0, IVA = 0;
        char categoria = ' ';
        
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il prezzo del prodotto (IVA inclusa)");
        spesa = tastiera.nextDouble();
        System.out.println("Inserire la categoria del prodotto (A, B o C)");
        categoria = tastiera.next().charAt(0);
        
        // elaborazione dei dati inseriti dall'utente
        switch(categoria) {
            case 'a':
            case 'A':
            IVA = spesa * 4 / 100;
            break;
            case 'b':
            case 'B':
            IVA = spesa * 10 / 100;
            break;
            case 'c':
            case 'C':
            IVA = spesa * 22 / 100;
            break;
            default:
            System.out.println("Categoria non prevista");
        }
            
        // visualizzazione del risultato
        if (IVA > 0) {
            System.out.println("La spesa è " + spesa + " € di cui " + IVA + " € di IVA");
        }

        tastiera.close();
    }
}