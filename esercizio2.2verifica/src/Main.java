/* Modificare il programma precedente perché oltre al valore dell'IMC, il programma fornisca
 * un messaggio riguardante la propria "Situazione peso" (sovrappeso, regolare o sottopeso). 
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
        System.out.println("Il valore dell'IMC è: "+ IMC);
        if (IMC > 25.00) {
            System.out.println("La propria situazione peso è sovrappeso");
        }
        if (IMC >= 18.50 && IMC <= 25.00) {
            System.out.println("La propria situazione peso è regolare");
        }
        if (IMC < 18.50) {
            System.out.println("La propria situazione peso è sottopeso");
        }
            dati.close();
    }
}