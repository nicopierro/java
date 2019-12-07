public class Prodotto
{
    // attributi
    private double prezzo;
    private char iva;

    // costruttori
    public Prodotto() {
        prezzo = 0;
        iva = 'x';
    }
    
    public Prodotto(double p, char i) {
        prezzo = p;
        iva = i;
    }

    // metodi
    public double getPrezzo() {
        return prezzo;
    }
    
    public char getIva() {
        return iva;
    }
    
    public double calcoloIva() {
        double valoreIva = 0;
        switch (iva) {
            case 'M':
            case 'm':
            valoreIva = prezzo * 4 / 100;
            break;
            case 'R':
            case 'r':
            valoreIva = prezzo * 10 / 100;
            break;
            case 'O':
            case'o':
            valoreIva = prezzo * 22 / 100;
            break;
        }
        
        return valoreIva;

    }
    
    public double getPrezzoFinale() {
        return prezzo + calcoloIva();
    }
    
    public void setPrezzo(double p) {
        prezzo = p;
    }
    
    public void setIva(char i) {
        iva = i;
    }

}

// javac src/Prodotto.java -d bin