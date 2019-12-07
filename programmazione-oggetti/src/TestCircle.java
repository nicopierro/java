cpublic class TestCircle {
    public static void main(String[] args) {
        // istanza di Circle
        Circle c1 = new Circle();
        System.out.println("Raggio: " + c1.getRadius());
        System.out.println("Colore: " + c1.getColor());
        System.out.println("Area: " + c1.getArea());

        // per avere un cerchio con parametro radius = 5.0
        Circle c2 = new Circle(5.0);
        System.out.println("Raggio: " + c2.getRadius());
        System.out.println("Colore: " + c2.getColor());
        System.out.println("Area: " + c2.getArea());

        // per avere un cerchio con parametro radius = 10.0 e parametro colore = blue
        // l'ordine dei parametri è importante
        Circle c3 = new Circle(10.0, "blue");
        System.out.println("Raggio: " + c3.getRadius());
        System.out.println("Colore: " + c3.getColor());
        System.out.println("Area: " + c3.getArea());

    }
}

// COMPILAZIONE di CIRCLE: java programmazione-oggetti/src/Circle.java -d programmazione-oggetti/bin
// COMPILAZIONE di TESTCIRCLE: javac -cp programmazione-oggetti/bin programmazione-oggetti/src/TestCircle.java -d programmazione-oggetti/bin