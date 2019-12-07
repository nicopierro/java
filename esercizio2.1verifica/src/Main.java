/* Scrivere un programma java che permetta all'utente di inserire il proprio 
 * peso in (kg) e la propria altezza (in cm) e che fornisca il valore dell'IMC.
 */ 
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double peso = -1;
        double altezza = -1;
        Scanner dati = new Scanner(System.in);
        System.out.println("Inserire il proprio peso in kilogrammi:");
        peso = dati.nextFloat();
        System.out.println("Inserire la propria altezza in centimetri:");
        altezza = dati.nextFloat();
        altezza = altezza / 100;
        double IMC = peso / (altezza * altezza);
        System.out.println("Il valore dell'IMC è: " + IMC);
        dati.close();
    }
	   
}

