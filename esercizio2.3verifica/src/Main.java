/* Modificare il programma precedente perché oltre a quanto previsto dai due esercizi precedenti venga controllato che
 * i valori inseriti dall'utente siano positivi. Se i valori sono positivi, proseguire con il calcolo, se sono negativi
 * visualizzare un messaggio di errore indicando il problema e terminare il programma senza eseguire nessun calcolo.
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
        if (peso > 0 && altezza > 0){
            altezza = altezza / 100;
            double IMC = peso / (altezza * altezza);
            System.out.println("Il valore dell'IMC è: " + IMC);
            if (IMC > 25.00) {
                System.out.println("La propria situazione peso è sovrappeso");
            }
            if (IMC >= 18.50 && IMC <= 25.00) {
                System.out.println("La propria situazione peso è regolare");
            }
            if (IMC < 18.50) {
                System.out.println("La propria situazione peso è sottopeso");
            }
        } else {
            System.out.println("I valori di peso e altezza devono essere entrambi positivi");
            dati.close();
        }
	   
    }
}
