public class TestSquare {
    public static void main(String[] args) {
        // istanza di Square
        Square s1 = new Square();
        System.out.println("Perimetro: " + s1.getPerimetro());
        System.out.println("Area: " + s1.getArea());
        System.out.println("Diagonale: " + s1.getDiagonale());

        // per avere un quadrato con lato = 10.0
        Square s2 = new Square(10.0);
        System.out.println("Perimetro: " + s2.getPerimetro());
        System.out.println("Area: " + s2.getArea());
        System.out.println("Diagonale: " + s2.getDiagonale());


        // l'ordine dei parametri è importante
       
    }
}

// COMPILAZIONE di SQUARE: java programmazione-oggetti/src/Square.java -d programmazione-oggetti/bin
// COMPILAZIONE di TESTSQUARE: javac -cp programmazione-oggetti/bin programmazione-oggetti/src/TestSquare.java -d programmazione-oggetti/bin