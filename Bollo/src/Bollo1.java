// Scrivere un programma che permetta di calcolare quanto deve pagare di bollo dell'automobile.

// Autore: Nicolò Pierro

// Data: 21/10/2019

// import delle librerie necessarie
import java.util.Scanner;
public class Bollo1 {

    public static void main(String[] args) {
        // dichiarazione delle variabili
        int classe, KW;
        double bollo = 0;
        Scanner tastiera = new Scanner(System.in);
        
        // input dei dati
        System.out.println("Inserisci la classe ambientale");
        classe = tastiera.nextInt();
        System.out.println("Inserisci i KW");
        KW = tastiera.nextInt();
        
        // elaborazione dei dati
        switch(classe) {
            case 0:
                if (KW <= 100) {
                    bollo = KW * 3;
                } else {
                    bollo = 300 + 4.50 * (KW - 100);
                }
                System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo);
                break;
            case 1:
                if (KW <= 100) {
                    bollo = KW * 2.90;
                } else {
                    bollo = 290 + 4.35 * (KW - 100);
                }
                System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo);
                break;
            case 2:
                if (KW <= 100) {
                    bollo = KW * 2.80;
                } else {
                    bollo = 280 + 4.20 * (KW - 100);
                }
                System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo);
                break;
            case 3:
                if (KW <= 100) {
                    bollo = KW * 2.70;
                } else {
                    bollo = 270 + 4.05 * (KW - 100);
                }
                System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo);
                break;
            case 4:
            case 5:
            case 6:
                if (KW <= 100) {
                    bollo = KW * 2.58;
                } else {
                    bollo = 258 + 3.87 * (KW - 100);
                }
                System.out.println("Il bollo da pagare per un'auto da " + KW + " in classe ambientale " + classe + " è di " + bollo);
                break;
            default:
                System.out.println("Classe ambientale non prevista");
        }
        tastiera.close();
    }
}
