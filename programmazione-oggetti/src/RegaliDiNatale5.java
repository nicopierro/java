import java.util.Scanner;

public class RegaliDiNatale5 {
    public static void main(String[] args) {

        int scelta = 0;
        Scanner tastiera = new Scanner(System.in);
        Regalo[] vettoreT1 = new Regalo[20];
        Regalo[] vettoreT2 = new Regalo[20];

        for (int y = 0; y < 20; y++) {
            vettoreT1[y] = new Regalo();
            vettoreT2[y] = new Regalo();
        }
        
        int posizioneRegalo = 0;
        
        while (scelta != 5) {
            System.out.println("opzione 1: inserisci un regalo nella tua lista dei desideri");
            System.out.println("opzione 2: la tua lista dei desideri");
            System.out.println("opzione 3: la lista dei desideri di un tuo amico");
            System.out.println("opzione 4: fai un regalo a un tuo amico");
            System.out.println("opzione 5: esci dal programma");

            scelta = tastiera.nextInt();
            switch (scelta) {
                case 1:
                    if (posizioneRegalo < 20) {
                        System.out.println("Inserisci il tuo nome");
                        vettoreT1[posizioneRegalo].setDestinatario(tastiera.nextLine());
                        tastiera.nextLine();
    
                        System.out.println("Inserisci il regalo");
                        vettoreT1[posizioneRegalo].setRegalo(tastiera.nextLine());
    
                        System.out.println("Inserisci il prezzo del regalo");
                        vettoreT1[posizioneRegalo].setPrezzo(tastiera.nextDouble());
                        posizioneRegalo += 1;          
                    } else {
                        System.out.println("Hai raggiunto il limite di regali che puoi fare.");
                    }
                

                    break;
                
                case 2:
                    System.out.println("Inserisci il tuo nome");
                    String nome = tastiera.nextLine();
                    for (int i = 0; i < posizioneRegalo; i++) {
                        vettoreT1[i].getDestinatario();
                        if (vettoreT1[i].getDestinatario().equals(nome) == true) {
                            System.out.println(vettoreT1[i].getRegalo() + " " + vettoreT1[i].getPrezzo() + " " + vettoreT1[i].getStato());
                        }
                    }
            
                    break;
                case 3:
                    System.out.println("Inserisci il tuo nome");
                    nome = tastiera.nextLine();
                    for (int i = 0; i < posizioneRegalo; i++) {
                        vettoreT2[i].getDestinatario();
                        if (vettoreT2[i].getDestinatario().equals(nome) == true) {
                            System.out.println(vettoreT2[i].getRegalo() + " " + vettoreT2[i].getPrezzo() + " " + vettoreT1[i].getStato());
                        }
                    }
                    break;
                case 4:
                    if (posizioneRegalo < 20) {
                        vettoreT2[posizioneRegalo].setStato(true);
                        System.out.println("Inserisci il tuo nome del tuo amico");
                        vettoreT2[posizioneRegalo].setDestinatario(tastiera.nextLine());
                        tastiera.nextLine();
    
                        System.out.println("Inserisci il regalo che riceverà il tuo amico");
                        vettoreT2[posizioneRegalo].setRegalo(tastiera.nextLine());
    
                        System.out.println("Inserisci il prezzo del regalo del tuo amico");
                        vettoreT2[posizioneRegalo].setPrezzo(tastiera.nextDouble());
                        posizioneRegalo += 1;          
                    } else {
                        System.out.println("Hai raggiunto il limite di regali che puoi fare.");
                    }
                    break;
                case 5:
                    System.out.println("Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }

        
        }

        tastiera.close();

    }
}
