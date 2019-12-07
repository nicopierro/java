
public class TestProdotto1 {
    
    public static void main(String[] args) {
        
        Prodotto p1 = new Prodotto(345.23, 'R');
        
        p1.calcoloIva();
        
        System.out.println("Prezzo del prodotto: " + p1.getPrezzo() + ", IVA pari a: " + p1.calcoloIva() + "% per un prezzo totale di " + p1.getPrezzoFinale() + " euro");
        
    }
    
}
