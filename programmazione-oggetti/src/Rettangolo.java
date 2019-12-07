// classe Rettangolo
// attributi base, altezza
// metodi perimetro(), area(), ridimensiona()
public class Rettangolo {
    private double base, altezza;
    
    public Rettangolo() {
        base = 10;
        altezza = 5;
    }
    
    public Rettangolo(double b, double a) {
        base = b;
        altezza = a;
    }
    
    public void ridimensiona(double b, double a) {
        base = b;
        altezza = a;
    }
    
    public double perimetro() {
        return base + base + altezza + altezza;
    }
    
    public double area() {
        return base * altezza;
    }
}