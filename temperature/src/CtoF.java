/* Autore: Nicolò Pierro
 * Data: 7/10/2019
 * Scrivere un programma in java che permetta all'utente di inserire un valore di temperatura espresso
 * in °F e ottenere il corrispondente valore in °C. Chiamare la classe CtoF.
 */

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double Celsius;
        double Fahrenheit;
	    Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserire il valore di temperatura espresso in °C");
	    Celsius = tastiera.nextDouble();
	    Fahrenheit = Celsius * 1.8 + 32;
	    System.out.println(Celsius + " gradi Celsius corrispondono a " + Fahrenheit + " gradi Fahrenheit");
	    tastiera.close();
    }

}
