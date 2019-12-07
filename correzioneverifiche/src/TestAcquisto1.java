/* 
 * Utilizzare la classe Acquisto appena creata per realizzare un programma TestAcquisto1 che permetta di:
 * creare un acquisto chiamato “Kiwi” dal peso di 5 Kg e che costa 2 € al Kg
 * calcolare il prezzo dell’acquisto 
 * visualizzare quanto bisogna pagare con il messaggio: “Il prodotto <nome> che pesa <peso> costa <prezzo>” (sostituire alle info nelle < > i valori corrispondenti)
 */


public class TestAcquisto1 {
    public static void main(String[] args) {
        
        Acquisto a1 = new Acquisto("Kiwi", 5.0, 2.0);
        
        System.out.println("Il prodotto " + a1.getNome() + " che pesa " + a1.getPeso() + " kg costa " + a1.prezzoFinale() + " €");
        
    }

}
