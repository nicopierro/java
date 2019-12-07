// Creare la classe persona 
// attributi nome, sesso, peso, altezza
// costruttori 2: vuoto e con tutte le informazioni
// metodi IMC

// creare un programma TestPersona che permetta all'utente di inserire i propri dati e che calcoli il valore dell'IMC


public class Person {
    // Non c'è public static void main(String[] args) perché non va in esecuzione 
    // attributi di Persona
    public String name;
    public char sex;
    public double weight, height;
    
    // costruttori (Il nome del costruttore deve essere uguale al nome della classe)
    public Person() {
        name = "N.P";
        sex = 'M';
        weight = 70.0;
        height = 178.0;
    }
    
    public Person(String n, char s, double w, double h){
        name = n;
        sex = s;
        weight = w;
        height = h;
    }
    
    public String getName(){
        return name;
    }
    
    public char getSex(){
        return sex;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getIMC(){
        return weight / Math.pow(height/100,2);
    }
    
    
}