/* 
 * Utilizzare la classe Acquisto per realizzare un programma TestAcquisto2 che permetta di
 * creare un acquisto senza attribuire nessun valore agli attributi
 * far inserire all’utente il nome dell’acquisto, il peso e il prezzo al Kg
 * modificare lo stato dell’acquisto aggiornando i valori del nome, del peso e del prezzo al Kg appena inseriti
 * calcolare il prezzo dell’acquisto
 * visualizzare quanto bisogna pagare con il messaggio: “Il prodotto <nome> che pesa <peso> costa <prezzo>” (sostituire alle info nelle < > i valori corrispondenti)
 */

import java.util.Scanner;

public class TestAcquisto3 {
    public static void main(String[] args) {

        Acquisto a1 = new Acquisto();

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il nome dell'acquisto:");
        a1.setNome(tastiera.nextLine());
        if (a1.getNome().compareTo("") == 0) {
            System.out.println("Inserire un nome");
        } else
            System.out.println("Inserire il peso dell'acquisto (in kg):");
            a1.setPeso(tastiera.nextDouble());
            if (a1.getPeso() <= 0) {
                System.out.println("Inserire un peso positivo");
            } else {
                System.out.println("Inserire il prezzo al kg dell'acquisto:");
                a1.setPrezzoAlKg(tastiera.nextDouble());
                if (a1.getPrezzoAlKg() <= 0) {
                    System.out.println("Inserire un prezzo positivo");
                } else {
                    if (a1.getPrezzoAlKg() > 0) {
                        System.out.println("Il prodotto " + a1.getNome() + " che pesa " + a1.getPeso() + " kg costa " + a1.prezzoFinale()
                                           + " €");
                    } else {
                        System.out.println("Inserire un prezzo positivo");
                    }
                    
                }
                
            }
            
            tastiera.close();
        }

    
    
        }
    

