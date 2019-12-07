// classe Persona
// attributi nome, peso, altezza
// metodi calcolaIMC(), valutaPeso();
public class Persona {
    private String nome, situazionepeso;
    private double peso, altezza, IMC;
    
    public Persona() {
        nome = "Nicolò Pierro";
        peso = 70;
        altezza = 178;
        
    }
    
    public Persona(String n, double p, double a) {
        nome = n;
        peso = p;
        altezza = a;
    }
    
    public double calcolaIMC() {
        return IMC = peso / Math.pow(altezza/100,2);
    }
    
    public String valutaPeso() {
        if (IMC > 25.00) {
            situazionepeso = "Attenzione! La propria situazione peso è sovrappeso"; 
            return situazionepeso;
        } else if (IMC >= 18.50 && IMC <= 25.00) {
            situazionepeso = "Complimenti! La propria situazione peso è regolare"; 
            return situazionepeso;
        } else {
            situazionepeso = "Attenzione! La propria situazione peso è sottopeso"; 
            return situazionepeso;
        }
       
    }
    
    public String getNome() { 
        return nome;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public double getAltezza() {
        return altezza;
    }
    
    public void setAltezza(double a) {
        altezza = a;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public void setPeso(double p) {
        peso = p;
    }
    
}
