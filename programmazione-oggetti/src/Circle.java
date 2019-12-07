public class Circle {
    // Non c'è public static void main(String[] args) perché non va in esecuzione 
    // attributi di Circle
    private double radius;
    private String color;

    // costruttori (Il nome del costruttore deve essere uguale al nome della classe)
    public Circle() {
        // raggio e colori di default
        radius = 1.0;
        color = "red";
    }


    public Circle(double r) {
        // parametro radius prende come valore r (valore inserito dall'utente) 
        color = "red";
        radius = r;
    }

    public Circle(double r, String c) {
        color = c;
        radius = r;
    }

    // metodi di Circle
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


}