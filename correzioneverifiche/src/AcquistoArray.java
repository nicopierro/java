public class AcquistoArray {
    // Attributi:
    private String nome;
    private double peso, prezzoAlKg;
    int IVA;

    // Costruttori:
    public AcquistoArray() {
        nome = "";
        peso = 0.0;
        prezzoAlKg = 0.0;
    }

    public AcquistoArray(String n, double pe, double pr, int i) {
        nome = n;
        peso = pe;
        prezzoAlKg = pr;
        IVA = i;
    }
    
    // Metodi:
    public String getNome() {
        return nome;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getPrezzoAlKg() {
        return prezzoAlKg;
    }
    
    public int getIVA() {
        return IVA;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public void setPeso(double pe) {
        peso = pe;
    }
    
    public void setPrezzoAlKg(double pr) {
        prezzoAlKg = pr;
    }
    
    public void setIVA(int i) {
        IVA = i;
    }

    public double prezzoFinale() {
        double prezzoFinale = peso * prezzoAlKg;
        return prezzoFinale;
    }
    
    public double calcoloIVA() {
        double valoreIVA = 0;
        valoreIVA = prezzoFinale() * IVA / 100;
        return valoreIVA;
        
    }
    

}
