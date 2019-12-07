public class Regalo {
   
    private String regalo, destinatario, mittente, visualizzaStato;
    private double prezzo;
    boolean stato = false;
   
    public Regalo(){
        regalo = " ";
        destinatario = " ";
        mittente = " ";
        prezzo = 0.0;
    }
   
    public Regalo(String r, String d, String m, double p){
        regalo = r;
        destinatario = d;
        mittente = m;
        prezzo = p;
    }
   
    public String getRegalo(){
        return regalo;
    }
   
    public void setRegalo(String r){
        regalo = r;
    }
   
    public String getDestinatario(){
        return destinatario;
    }
   
    public void setDestinatario(String d){
        destinatario = d;
    }
   
    public String getMittente(){
        return mittente;
    }
   
    public void setMittente(String m){
        mittente = m;
    }
   
    public double getPrezzo(){
        return prezzo;
    }
   
    public void setPrezzo(double p){
        prezzo = p;      
    }
    
    public void setStato(boolean s){
        stato = s;
    }
    
    public String getStato() {
        if (stato == true) {
            return visualizzaStato = "Qualcuno te lo ha regalato";
        } else {
            return visualizzaStato = "Nessuno te lo ha regalato";
        }
    }
   
}

