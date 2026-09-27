import java.util.Scanner;

public class PRAK104_2510817120002_AmaliaSoraya {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] abu_hand = new String[3];
        String[] bagas_hand = new String[3];
        int bagas = 0;
        int abu = 0;

        System.out.print("Tangan Abu: ");
        for(int i = 0; i < 3; i++){
            String hand = scanner.next();
            abu_hand[i] = hand;
        }

        System.out.print("Tangan Bagas: ");
        for(int i = 0; i < 3; i++){
            String hand = scanner.next();
            bagas_hand[i] = hand;
        }

        for(int i = 0; i < 3; i++) {
            if((abu_hand[i].equals("B") && bagas_hand[i].equals("G")) ||
                    (abu_hand[i].equals("G") && bagas_hand[i].equals("K")) ||
                    (abu_hand[i].equals("K") && bagas_hand[i].equals("B"))){
                abu++;
            } else if((abu_hand[i].equals("G") && bagas_hand[i].equals("B")) ||
                    (abu_hand[i].equals("K") && bagas_hand[i].equals("G")) ||
                    (abu_hand[i].equals("B") && bagas_hand[i].equals("K"))) {
                bagas++;
            }
        }

        if(bagas > abu) {
            System.out.println("Bagas");
        } else if(abu > bagas) {
            System.out.println("Abu");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
    }
}