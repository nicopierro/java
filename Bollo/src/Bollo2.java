// Scrivere un programma che permetta di calcolare quanto deve pagare di bollo dell'automobile.

// Autore: Nicolò Pierro

// Data: 21/10/2019

// import delle librerie necessarie
import java.util.Scanner;
public class Bollo2 {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        int classe, KW, eta, superbollo = 0;
        double bollo = 0;
        Scanner tastiera = new Scanner(System.in);
        
        // input dei dati
        System.out.println("Inserisci la classe ambientale della tua automobile");
        classe = tastiera.nextInt();
        System.out.println("Inserisci i KW della tua automobile");
        KW = tastiera.nextInt();
        System.out.println("Inserisci l'età della tua automobile");
        eta = tastiera.nextInt();
        
        // elaborazione dei dati
        switch(classe) {
            case 0:
                if (KW <= 100) {
                    bollo = KW * 3;
                } else {
                    bollo = 300 + 4.50 * (KW - 100);
                }
    
                break;
            case 1:
                if (KW <= 100) {
                    bollo = KW * 2.90;
                } else {
                    bollo = 290 + 4.35 * (KW - 100);
                }
                
                break;
            case 2:
                if (KW <= 100) {
                    bollo = KW * 2.80;
                } else {
                    bollo = 280 + 4.20 * (KW - 100);
                }
                
                break;
            case 3:
                if (KW <= 100) {
                    bollo = KW * 2.70;
                } else {
                    bollo = 270 + 4.05 * (KW - 100);
                }
                
                break;
            case 4:
            case 5:
            case 6:
                if (KW <= 100) {
                    bollo = KW * 2.58;
                } else {
                    bollo = 258 + 3.87 * (KW - 100);
                }
                
                break;
            default:
                System.out.println("Classe ambientale non prevista");
        }
        
        if (KW > 185) {
            
            if (eta >= 0 && eta <= 5) {
                superbollo = 20;
                
            } else if (eta > 5 && eta <= 10) {
                superbollo = 12;
                
            } else if (eta > 10 && eta <= 15) {
                superbollo = 6;
                
            } else if (eta > 15 && eta <= 20) {
                superbollo = 3;
                
            } else if (eta > 20) {
                
                superbollo = 0;
            }

                
            
        }
        
        System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo + " €. Il superbollo da pagare per un'auto di " + eta + " anni è di " + superbollo + " €.");
    }
}
