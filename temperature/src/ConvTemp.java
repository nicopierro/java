/* Autore: Nicolò Pierro
 * Data: 7/10/2019
 * Scrivere un programma in Java che possa eseguire entrambe le conversioni. All'inizio il programma visualizza all'utente un menù.
 */
import java.util.Scanner;
public class ConvTemp {
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
        } 
        
        decisione.close();
        
    }
     
}
