package Modul3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Dadu> listDadu = new LinkedList<Dadu>();

        int N = sc.nextInt();
        int totalNilai = 0;
        for(int i = 1; i <= N; i++){
            Dadu dadu = new Dadu();
            listDadu.add(dadu);
            int randomDadu = dadu.acakNilai();
            System.out.println("Dadu ke- " + i + " bernilai " + randomDadu);
            totalNilai += randomDadu;
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);

        sc.close();
    }
}
