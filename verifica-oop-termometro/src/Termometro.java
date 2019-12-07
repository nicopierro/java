// classe Termometro
// attributi tempcelsius
// costruttori uno vuoto e uno con valore assegnato
// metodi getTemperatura(), setTemperatura(), getFahrenheit(), getKelvin()
// Autore: Nicolò Pierro
// Data: 18/11/2019

public class Termometro {
    private double tempC;
    
    public Termometro() {
        tempC = 0;
        
    }
    
    public Termometro(double tc) {
        tempC = tc;
    }
    
    public double getTemperatura() {
        return tempC;
    }
    
    public void setTemperatura(double tc) {
        tempC = tc;   
    }
    
    public double getFahrenheit(double tc) {
        return tempC * 1.8 + 32;
    }
    
    public double getKelvin(double tc) {
        return tempC + 273.15;
    }
    
    
}
