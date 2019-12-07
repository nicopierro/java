import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        // istanza di Person
        Scanner tastiera = new Scanner(System.in);
	    System.out.println("Inserisci il tuo nome:");
	    String name = tastiera.nextLine();
	    System.out.println("Inserisci il tuo sesso:");
	    char sex = tastiera.next().charAt(0);
	    System.out.println("Inserisci il tuo peso:");
	    double weight = tastiera.nextDouble();
	    System.out.println("Inserisci la tua altezza:");
	    double height = tastiera.nextInt();
	    
        Person p1 = new Person();
        System.out.println("Nome: " + p1.getName());
	    System.out.println("Sesso: " + p1.getSex());
	    System.out.println("Peso: " + p1.getWeight());
	    System.out.println("Altezza: " + p1.getHeight());
	    System.out.printf("IMC: %.2f%n" , p1.getIMC());

        Person p2 = new Person(name, sex, weight, height);
        System.out.println("Nome: " + p2.getName());
	    System.out.println("Sesso: " + p2.getSex());
	    System.out.println("Peso: " + p2.getWeight());
	    System.out.println("Altezza: " + p2.getHeight());
	    System.out.printf("IMC: %.2f%n" , p2.getIMC());
	    
	    tastiera.close();
        

        // l'ordine dei parametri è importante
       
    }
}

// COMPILAZIONE di PERSON: java programmazione-oggetti/src/Square.java -d programmazione-oggetti/bin
// COMPILAZIONE di TESTPERSON: javac -cp programmazione-oggetti/bin programmazione-oggetti/src/TestSquare.java -d programmazione-oggetti/bin