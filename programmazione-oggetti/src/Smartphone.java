// classe Smartphone
// attributi memoriaLibera
// metodi scattaFoto(), rimuoviFoto();
public class Smartphone {
    public double memoriaLibera;
    
    public Smartphone() {
        memoriaLibera = 1024;
    }
    
    public Smartphone(double mL) {
        memoriaLibera = mL;
    }
    
    public double scattaFoto() {
        memoriaLibera -=5;
        return memoriaLibera;
    }
    
    public double rimuoviFoto() {
        memoriaLibera +=5;
        return memoriaLibera;
    }
}
