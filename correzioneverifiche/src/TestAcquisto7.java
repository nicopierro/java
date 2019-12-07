/*
 * in modo che quando viene mandato in esecuzione con il comando ”java TestAcquisto7” si possa anche inserire il numero di acquisti che si vogliono fare
 * Esempio: java TestAcquisto 20 ---> 20 acquisti
 */

import java.util.Scanner;

public class TestAcquisto7 {
    public static void main(String[] args) {
        
        
        // args[0] è il primo numero dopo il comando di execute
        final int numeroAcquisti = Integer.parseInt(args[0]);
        
        AcquistoArray[] acquisti = new AcquistoArray[numeroAcquisti];

        for (int i = 0; i < numeroAcquisti; i++) {
            acquisti[i] = new AcquistoArray();
        }
        
        Scanner tastiera = new Scanner(System.in);
        
        for (int i = 0; i < numeroAcquisti; i++) {
            System.out.println("Inserire il nome dell'acquisto:");
            acquisti[i].setNome(tastiera.next());
            System.out.println("Inserire il peso dell'acquisto (in kg):");
            acquisti[i].setPeso(tastiera.nextDouble());
            System.out.println("Inserire il prezzo al kg dell'acquisto:");
            acquisti[i].setPrezzoAlKg(tastiera.nextDouble());
            System.out.println("Inserire l'iva del prodotto (4%, 10% o 22%):");
            acquisti[i].setIVA(tastiera.nextInt());
            
            tastiera.nextLine();
        }
        
        double sommaPrezzi = 0;
        double sommaIVA = 0;
        
        for (int i = 0; i < numeroAcquisti; i++) {
            
            sommaPrezzi = sommaPrezzi + acquisti[i].prezzoFinale();
            sommaIVA = sommaIVA + acquisti[i].calcoloIVA();
        
        }
        
        System.out.println("Il totale da pagare è di " + sommaPrezzi + " € di cui " + sommaIVA + " € di IVA");
        
        tastiera.close();
    }

}
