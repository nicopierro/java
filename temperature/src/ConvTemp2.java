/* Autore: Nicolò Pierro
 * Data: 7/10/2019
 * Modificare il mprogramma precedente per controllare il valore iniziale inserito dall'utente: se l'utente inserisce 
 * valori diversi da 1, 2 e 3 il programma deve visualizzare il messaggio "scelta non prevista" e terminare
 */
import java.util.Scanner;
public class ConvTemp2 {
    public static void main(String[] args) {
        int scelta;
        double Celsius;
        double Fahrenheit;
        Scanner decisione = new Scanner(System.in);
        System.out.println("Inserire il valore 1 per effettuare la conversione °F -> °C");
        System.out.println("Inserire il valore 2 per effettuare la voncersione °C -> °F");
        System.out.println("Inserire il valore 3 per uscire senza effettuare nessuna conversione");
        System.out.println("Inserisci la tua scelta ->");
        scelta = decisione.nextInt();
        if (scelta == 1) {
            Scanner FtoC = new Scanner(System.in);
	        System.out.println("Inserire il valore di temperatura espresso in °F");
	        Fahrenheit = FtoC.nextDouble();
	        Celsius = (Fahrenheit - 32) / 1.8;
	        System.out.println(Fahrenheit + " gradi Fahrenheit corrispondono a " + Celsius + " gradi Celsius");
	        FtoC.close();
        } else if (scelta == 2) {
            Scanner CtoF = new Scanner(System.in);
	        System.out.println("Inserire il valore di temperatura espresso in °C");
	        Celsius = CtoF.nextDouble();
	        Fahrenheit = Celsius * 1.8 + 32;
	        System.out.println(Celsius + " gradi Celsius corrispondono a " + Fahrenheit + " gradi Fahrenheit");
	        CtoF.close();
        } else {
            System.out.println("scelta non prevista");
            decisione.close();
        }
        
        
    }
     
}
