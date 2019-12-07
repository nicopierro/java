// Fare in modo che cambiando solo il valore di una variabile si possa utilizzarlo per un numero variabile di acquisti

import java.util.Scanner;

public class TestAcquisto6 {
    public static void main(String[] args) {
        
        final int numeroAcquisti = 5;
        
        AcquistoArray[] acquisti = new AcquistoArray[numeroAcquisti];

        for (int i = 0; i < numeroAcquisti; i++) {
            acquisti[i] = new AcquistoArray();
        }
        
        Scanner tastiera = new Scanner(System.in);
        
        for (int i = 0; i < numeroAcquisti; i++) {
            System.out.println("Inserire il nome dell'acquisto:");
            acquisti[i].setNome(tastiera.nextLine());
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
