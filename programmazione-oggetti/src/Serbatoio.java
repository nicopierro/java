// classe Serbatoio
// attributi capacità massima e livello attuale di benzina (in litri)
// metodi aggiungiBenzina(), togliBenzina(), livelloBenzina(), benzinaMancante()
public class Serbatoio {
    private double benzinamax, benzinainserbatoio;
    
    public Serbatoio(double bmax, double bis) {
        benzinamax = bmax;
        benzinainserbatoio = bis;
    }
    
    public double aggiungiBenzina() {
        return benzinainserbatoio;
    }
    
    public double togliBenzina() {
        return benzinainserbatoio;
    }
    
    public double livelloBenzina() {
        return benzinainserbatoio;
    }
    
    public double benzinaMancante() {
        return (benzinamax - benzinainserbatoio);
    }
}