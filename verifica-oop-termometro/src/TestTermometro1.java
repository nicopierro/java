// creare un termometro con temperatura = 20 gradi celsius
// convertire in F e K
// visualizzare le temperature
// Autore: Nicolò Pierro
// Data: 18/11/2019

public class TestTermometro1 {
    public static void main(String[] args) {
        double tempC = 0;
        double tempF = 0;
        double tempK = 0;
        
        Termometro t1 = new Termometro (20.0);
    
        System.out.println(t1.getTemperatura() + "°C corrispondono a " + t1.getFahrenheit(tempC) + "°F e a " + t1.getKelvin(tempC) + " °K");
        
    }

}
