// creare un serbatoio di grandezza inserita dall'utente
// menu per aggiungere benzina, toglierla, sapere benzina attuale, sapere benzina mancante, uscire.
// ripresentare il menu una volta scelta l'operazione

import java.util.Scanner;

public class TestSerbatoio2 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire la capacità massima del serbatoio (in litri):");
        double benzinamax = tastiera.nextDouble();
        System.out.println("Inserire la quantità di benzina attualmente nel serbatoio (in litri):");
        double benzinainserbatoio = tastiera.nextDouble();
        
        int scelta = 0;
        
        while (scelta != 5) {
            System.out.println("Inserire il numero dell'operazione che si intende eseguire:");
            System.out.println("1: aggiungere benzina");
            System.out.println("2: togliere benzina");
            System.out.println("3: sapere il livello attuale di benzina");
            System.out.println("4: sapere quanta benzina manca per riempire il serbatoio");
            System.out.println("5: uscire");
            scelta = tastiera.nextInt();
            
            Serbatoio s1 = new Serbatoio(benzinamax, benzinainserbatoio);
            
            switch(scelta) {
                case 1:
                    System.out.println("Quanta benzina desidera aggiungere? (Esprimere la quantità in litri)");
                    double aggiungibenzina = tastiera.nextDouble();
                    benzinainserbatoio += aggiungibenzina;
                break;
                case 2:
                    System.out.println("Quanta benzina desidera togliere? (Esprimere la quantità in litri)");
                    double toglibenzina = tastiera.nextDouble();
                    benzinainserbatoio -= toglibenzina; 
                break;
                case 3:
                    System.out.println("Il livello attuale di benzina è " + s1.livelloBenzina() + " litri");
                break;
                case 4:
                    System.out.println("Mancano " + s1.benzinaMancante() + " litri di benzina per riempire il serbatoio");
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                    System.out.println("Scelta non prevista");
                break;
                
                
            }
        }

    }

}