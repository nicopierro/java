/* 
 * Nome della classe: Acquisto
 * Attributi: -nome: String 
 *            -peso: double
 *            -prezzoAlKg: double
 * Metodi: +getNome(): String
 *         +getPeso(): double
 *         +getPrezzoAlKg(): double       
 *         +setNome(String n): void
 *         +setPeso(double pe): void  
 *         +setPrezzoAlKg(double pr): void
 *         +PrezzoFinale(): double
 * Costruttori: +Acquisto() 
 *              +Acquisto(String n, double pe, double pr)
 */
public class Acquisto {
    // Attributi:
    private String nome;
    private double peso, prezzoAlKg;

    // Costruttori:
    public Acquisto() {
        nome = "";
        peso = 0.0;
        prezzoAlKg = 0.0;
    }

    public Acquisto(String n, double pe, double pr) {
        nome = n;
        peso = pe;
        prezzoAlKg = pr;
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
    
    public void setNome(String n) {
        nome = n;
    }
    
    public void setPeso(double pe) {
        peso = pe;
    }
    
    public void setPrezzoAlKg(double pr) {
        prezzoAlKg = pr;
    }
    
    public double prezzoFinale() {
        return peso * prezzoAlKg;
    }
}
