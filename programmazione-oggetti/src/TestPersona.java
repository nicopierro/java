import java.util.Scanner;

public class TestPersona {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserisci il tuo nome:");
	    String nome = tastiera.nextLine();
	    System.out.println("Inserisci il tuo peso:");
	    double peso = tastiera.nextDouble();
	    System.out.println("Inserisci l'altezza:");
	    double altezza = tastiera.nextInt();

        Persona p1 = new Persona(nome, peso, altezza);
        System.out.println("Nome: " + p1.getNome());
	    System.out.println("Peso: " + p1.getPeso());
	    System.out.println("Altezza: " + p1.getAltezza());
	    System.out.printf("IMC: %.2f%n" , p1.calcolaIMC());
	    System.out.println("Situazione peso: " + p1.valutaPeso());
	    p1.setNome("Luca Zanella");
	    p1.setPeso(73);
	    p1.setAltezza(180);
	    
	    tastiera.close();
       
    }
}
