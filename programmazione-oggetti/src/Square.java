
public class Square {
    // Non c'è public static void main(String[] args) perché non va in esecuzione 
    // attributi di Square
    private double side;
    
    // costruttori (Il nome del costruttore deve essere uguale al nome della classe)
    public Square() {
        // lato di default
        side = 1.0;
    }
    

    public Square(double s) {
        side = s;
    }
    
    
    // metodi di Square
    public double getPerimetro() {
        return side * 4;
    }
    
    public double getArea() {
        return side * side;
    }
    
    public double getDiagonale() {
        return side * (Math.sqrt(2));
    }
    
    
}