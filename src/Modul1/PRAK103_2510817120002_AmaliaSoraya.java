package Modul1;

import java.util.Scanner;

public class PRAK103_2510817120002_AmaliaSoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int start_num = scanner.nextInt();

        int i = 0;
        do {
            if(start_num % 2 == 1) {
                System.out.print(start_num);
                if(i < N-1){
                    System.out.print(", ");
                }
                i++;
            }
            start_num++;
        } while(i < N);

        scanner.close();
    }
}