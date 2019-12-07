/* Autore: Nicolò Pierro
 * Data: 7/10/2019
 * Scrivere un programma in java che permetta all'utente di inserire un valore di temperatura espresso
 * in °F e ottenere il corrispondente valore in °C. Chiamare la classe FtoC.
 */

import java.util.Scanner;

public class FtoC {

    public static void main(String[] args) {
	    double Fahrenheit;
	    double Celsius;
	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserire il valore di temperatura espresso in °F");
	    Fahrenheit = tastiera.nextDouble();
	    Celsius = (Fahrenheit - 32) / 1.8;
	    System.out.println(Fahrenheit + " gradi Fahrenheit corrispondono a " + Celsius + " gradi Celsius");
	    tastiera.close();
    }
}
