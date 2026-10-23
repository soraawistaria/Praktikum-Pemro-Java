package Modul4.soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan : ");
        String nama = sc.nextLine();

        System.out.print("Ras : ");
        String ras = sc.nextLine();

        HewanPeliharaan h = new HewanPeliharaan(ras, nama);

        h.display();
    }
}
