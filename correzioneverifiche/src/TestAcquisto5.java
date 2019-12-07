/* 
 * Fare in modo che l’utente possa inserire 5 acquisti e possa avere il totale da pagare.
 * Il programma deve visualizzare il messaggio: 
 * “Il totale da pagare è di <totale> € di cui <totaleIVA> € di IVA”
 */

import java.util.Scanner;

public class TestAcquisto5 {
    public static void main(String[] args) {
        
        AcquistoArray[] acquisti = new AcquistoArray[5];

        for (int i = 0; i < 5; i++) {
            acquisti[i] = new AcquistoArray();
        }
        
        Scanner tastiera = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserire il nome dell'acquisto:");
            acquisti[i].setNome(tastiera.nextLine());
            System.out.println("Inserire il peso dell'acquisto (in kg):");
            acquisti[i].setPeso(tastiera.nextDouble());
            System.out.println("Inserire il prezzo al kg dell'acquisto:");
            acquisti[i].setPrezzoAlKg(tastiera.nextDouble());
            System.out.println("Inserire l'iva del prodotto (4%, 10% o 22%");
            acquisti[i].setIVA(tastiera.nextInt());
            
            tastiera.nextLine();
        }
        
        double sommaPrezzi = 0;
        double sommaIVA = 0;
        
        for (int i = 0; i < 5; i++) {
            
            sommaPrezzi = sommaPrezzi + acquisti[i].prezzoFinale();
            sommaIVA = sommaIVA + acquisti[i].calcoloIVA();
        
        }
        
        System.out.println("Il totale da pagare è di " + sommaPrezzi + " € di cui " + sommaIVA + " € di IVA");
        
        tastiera.close();
    }

}
