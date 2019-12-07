import java.util.Scanner;

class Verifica {
    public static void main(String[] args) {
        int x;
        int y = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il valore di x: ");
        x = scanner.nextInt();
        while (x > 0)
              {
                   x--;
                   y += y;
              }
        System.out.println("il valore di y è: " + y);
        scanner.close();
        
    }
}
