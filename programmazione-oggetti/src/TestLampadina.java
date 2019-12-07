// memoria libera inserita dall'utente
// foto da scattare inserite dell'utente
// visualizzare memoria libera al termine

import java.util.Scanner;

public class TestLampadina {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il numero di click massimi prima che la lampadina si rompa:");
        double maxclick = tastiera.nextDouble();
        double x = 0;
        boolean check = false;
        
        Lampadina l1 = new Lampadina();
        
        
      
        
        // iterativamente offre all’utente la possibilità di invocare una delle due funzionalità (visualizzando l’esito dell’operazione, nel caso di stato())
        // o di terminare l’esecuzione.
        while (check == false) {
            System.out.println("Selezionare l'operazione da svolgere inserendo il numero corrispondente");
            System.out.println("1: Accendere o spegnere la lampadina");
            System.out.println("2: Visualizzare lo stato della lampadina (accesa o spenta)");
            System.out.println("3: Uscire");
            int scelta = tastiera.nextInt();
            switch(scelta) {
                case 1:
                    if (x < maxclick - 1) {
                        x += 1;
                    } else {
                        l1.setRotta(true);
                    }
                    l1.click();
                break;
                case 2:
                    l1.stato();
                    System.out.println("La lampadina è " + l1.stato());
                break;
                case 3:
                    check = true;  
                break;
                default:
                    System.out.println("Scelta non prevista");
                break;
            
            }
        
        } 

        tastiera.close();
        
        
    }

}