package Modul4.soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pilih jenis hewan peliharaan yang ingin diinputkan : \n" +
                "1 = Kucing\n2 = Anjing\n" +
                "Masukkan pilihan: ");

        int pilihan = sc.nextInt();
        sc.nextLine();

        if(pilihan == 1) {
            System.out.print("Nama Hewan Peliharaan : ");
            String nama = sc.nextLine();

            System.out.print("Ras : ");
            String ras = sc.nextLine();

            System.out.print("Warna Bulu : ");
            String warnabulu = sc.nextLine();

            Kucing k = new Kucing(ras, nama, warnabulu);

            k.displayDetailKucing();
        }
        else if(pilihan == 2) {
            System.out.print("Nama Hewan Peliharaan : ");
            String nama = sc.nextLine();

            System.out.print("Ras : ");
            String ras = sc.nextLine();

            System.out.print("Warna Bulu : ");
            String warnabulu = sc.nextLine();

            System.out.print("Kemampuan : ");
            String kmp = sc.nextLine();

            String[] kemampuan = kmp.split(", ");

            Anjing a = new Anjing(nama, ras, warnabulu, kemampuan);

            a.displayDetailAnjing();
        }
    }
}
