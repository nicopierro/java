// creare termometro senza assegnare valore all'attributo
// far inserire dall'utente la temperatura in C
// modificare lo stato del termometro con il valore inserito dall'utente
// convertire in F e K
// visualizzare le temperature
// Autore: Nicolò Pierro
// Data: 18/11/2019

import java.util.Scanner;

public class TestTermometro2 {
    public static void main(String[] args) {
        double tempC = 0;
        double tempF = 0;
        double tempK = 0;
        
        Termometro t1 = new Termometro();
        
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il valore della temperatura in °C");
        t1.setTemperatura(tastiera.nextDouble());
        
        System.out.println(t1.getTemperatura() + " °C corrispondono a " + t1.getFahrenheit(tempC) + " °F e a " + t1.getKelvin(tempC) + " °K");
        
        tastiera.close();
    
    }

}
