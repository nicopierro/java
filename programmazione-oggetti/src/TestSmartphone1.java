
// memoria libera: 1GB
// foto da scattare: 2
// visualizzare memoria libera al termine

public class TestSmartphone1 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone(1024);
        s1.scattaFoto();
        s1.scattaFoto();
        System.out.println("Memoria libera: " + s1.memoriaLibera);
        
    }

}
