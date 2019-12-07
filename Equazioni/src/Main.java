// Scrivere un programma che permetta di svolgere equazioni di primo e di secondo grado

// Autore: Nicolò Pierro

// Data: 21/10/2019

// import delle librerie necessarie
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        double a, b, c, x, x1, x2, delta;
        int scelta;
        
        // input dei dati
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Digitare 1 per trovare la soluzione di un'equazione di primo grado");
        System.out.println("Digitare 2 per trovare la soluzione di un'equazione di secondo grado");
        System.out.println("Digitare 3 per uscire dal programma");
        System.out.println("Digitare la propria scelta:");
        scelta = tastiera.nextInt();
        switch (scelta) {
            case 1:
                // equazione di primo grado
                System.out.println("ax + b = 0");
                System.out.println("Inserire il valore di a");
                a = tastiera.nextDouble();
                System.out.println("Inserire il valore di b");
                b = tastiera.nextDouble();
    
                // elaborazione dei dati inseriti dall'utente;
                if (a != 0) {
                    x = -b / a;
                
                    // visualizzazione del risultato
                    System.out.println("Il risultato è: " + x);
                } else {
                    System.out.println("L'equazione è impossibile");
                }

                break;
            case 2:
                System.out.println("Inserire il valore di a");
                a = tastiera.nextDouble();
                System.out.println("Inserire il valore di b");
                b = tastiera.nextDouble();
                System.out.println("Inserire il valore di c");
                c = tastiera.nextDouble();

                // elaborazione dei dati
                delta = Math.pow(b, 2) - (4 * a * c);
                if (delta < 0) {
                    System.out.println("L'equazione è impossibile");
                } else if (delta == 0) {
                    x = -b / (2 * a);
                    System.out.println("La soluzione è unica ed è: " + x);
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Le soluzioni sono " + x1 + " e " + x2);
                }
                break;
            case 3:
                System.out.println("A presto! :)");
                break;
            default:
                System.out.println("Scelta non prevista");
        }
        
    tastiera.close();    
    }
}
