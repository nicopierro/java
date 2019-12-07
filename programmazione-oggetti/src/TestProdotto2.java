import java.util.Scanner; 

public class TestProdotto2 {
    
    public static void main(String[] args) {
        
        Prodotto p1 = new Prodotto();
        
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il prezzo del prodotto:");
        double prezzo = tastiera.nextDouble();
        p1.setPrezzo(prezzo);
        System.out.println("Inserire il tipo di I.V.A. del prodotto:");
        char iva = tastiera.next().charAt(0);
        p1.setIva(iva);
        
        p1.calcoloIva();
        
        System.out.println("Prezzo del prodotto: " + p1.getPrezzo() + ", IVA pari a: " + p1.calcoloIva + "% per un prezzo totale di " + p1.getPrezzoFinale() + " euro");
        
    }
    
    
    

}
