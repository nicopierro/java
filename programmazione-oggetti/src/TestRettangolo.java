// creare un serbatoio di grandezza inserita dall'utente
// aggiungere 10 litri, poi 5, poi toglierne 7
// visualizzare litri attuali nel serbatoio
// visualizzare benzina mancante per riempire il serbatoio

import java.util.Scanner;

public class TestRettangolo {
    public static void main(String[] args) {
        
        double base, altezza;
        
        Rettangolo r1 = new Rettangolo();
        
        Rettangolo r2 = new Rettangolo(20, 10);
       
        Rettangolo r3 = new Rettangolo(50, 25);
        
        //calcoli e stampa usando i metodi perimetro() e area()
        System.out.println("Perimetro del primo rettangolo: " + r1.perimetro());
        System.out.println("Perimetro del secondo rettangolo: " + r2.perimetro());
        System.out.println("Perimetro del terzo rettangolo: " + r3.perimetro());
        System.out.println("Somma dei perimetri dei tre rettangoli: " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));
        System.out.println("Area del primo rettangolo: " + r1.area());
        System.out.println("Area del secondo rettangolo: " + r2.area());
        System.out.println("Area del terzo rettangolo: " + r3.area());
        System.out.println("Somma delle aree dei tre rettangoli: " + (r1.area() + r2.area() + r3.area()));
        
        // modifica di un rettangolo usando il metodo ridimensiona
        
        r1.ridimensiona(30, 15);
        
        // ri-stampa
        System.out.println("Perimetro del primo rettangolo: " + r1.perimetro());
        System.out.println("Perimetro del secondo rettangolo: " + r2.perimetro());
        System.out.println("Perimetro del terzo rettangolo: " + r3.perimetro());
        System.out.println("Somma dei perimetri dei tre rettangoli: " + (r1.perimetro() + r2.perimetro() + r3.perimetro()));
        System.out.println("Area del primo rettangolo: " + r1.area());
        System.out.println("Area del secondo rettangolo: " + r2.area());
        System.out.println("Area del terzo rettangolo: " + r3.area());
        System.out.println("Somma delle aree dei tre rettangoli: " + (r1.area() + r2.area() + r3.area()));
        
        
        
    }

}