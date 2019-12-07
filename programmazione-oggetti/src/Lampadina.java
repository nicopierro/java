// classe lampadina
// attributi accesa, spenta, rotta
// metodi stato() attuale della lampadina, click() per cambiare lo stato

public class Lampadina {
    
    private String stato = "Spenta";
    boolean rotta = false;
    
    public Lampadina() {
        stato = "Spenta";
    }
    
    public Lampadina(String s) {
        stato = s;
    }
    
    public String stato() {
        return stato;
    }
    
    public void setRotta (boolean r) {
        rotta = r;
    }
    
    public String click() {
        if (rotta == false) {
            if (stato == "Accesa") {
                stato = "Spenta";
            } else {
                stato = "Accesa";
            }
        } else {
            stato = "Rotta";
        }

        return stato;
    }
}
