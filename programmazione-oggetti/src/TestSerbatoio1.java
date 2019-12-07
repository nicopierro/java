// creare un serbatoio di grandezza inserita dall'utente
// aggiungere 10 litri, poi 5, poi toglierne 7
// visualizzare litri attuali nel serbatoio
// visualizzare benzina mancante per riempire il serbatoio

import java.util.Scanner;

public class TestSerbatoio1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire la capacità massima del serbatoio (in litri):");
        double benzinamax = tastiera.nextDouble();
        System.out.println("Inserire la quantità di benzina attualmente nel serbatoio (in litri):");
        double benzinainserbatoio = tastiera.nextDouble();
        
        benzinainserbatoio += 10;
        benzinainserbatoio += 5;
        benzinainserbatoio -= 7;
        Serbatoio s1 = new Serbatoio(benzinamax, benzinainserbatoio);
        System.out.println("Benzina nel serbatoio: " + s1.livelloBenzina());
        System.out.println("Benzina mancante per riempire il serbatoio: " + s1.benzinaMancante());
        
        
    }

}