/* 
 * modificare la classe TestAcquisto4 in modo che l’utente possa inserire anche il valore dell’IVA.
 * Al termine, il programma deve visualizzare il messaggio: 
 * “Il prodotto <nome> che pesa <peso> costa <prezzo> € di cui <valoreIVA> € di IVA al <percentualeIVA>” 
 * (sostituire alle info nelle < > i valori corrispondenti)
 */

import java.util.Scanner;

public class TestAcquisto4 {
    public static void main(String[] args) {
        
        AcquistoArray a1 = new AcquistoArray();
        
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il nome dell'acquisto:");
        a1.setNome(tastiera.nextLine());
        System.out.println("Inserire il peso dell'acquisto (in kg):");
        a1.setPeso(tastiera.nextDouble());
        System.out.println("Inserire il prezzo al kg dell'acquisto:");
        a1.setPrezzoAlKg(tastiera.nextDouble());
        System.out.println("Inserire l'iva del prodotto (4%, 10% o 22%");
        a1.setIVA(tastiera.nextInt());
        
        System.out.println("Il prodotto " + a1.getNome() + " che pesa " + a1.getPeso() + " kg costa " + a1.prezzoFinale() + " € di cui " + a1.calcoloIVA() + " € di IVA al " + a1.getIVA() + " %");
        
        tastiera.close();
    }

}
