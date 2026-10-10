package Modul3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Negara> listNegara = new LinkedList<Negara>();

        Scanner sc = new Scanner(System.in);
//        System.out.print("N : ");
        int N = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < N; i++) {
//            System.out.print("neg : ");
            String nama = sc.nextLine();
//            System.out.print("jenis : ");
            String jenis_kpem = sc.nextLine();
//            System.out.print("pres : ");
            String nama_pem = sc.nextLine();

            if(jenis_kpem.equals("monarki")) {
                Negara monarki = new Negara(nama, jenis_kpem, nama_pem);
                listNegara.add(monarki);
            } else {
//                System.out.print("tgl : ");
                int tanggal = sc.nextInt();
//                System.out.print("bln : ");
                int bulan = sc.nextInt();
//                System.out.print("thn : ");
                int tahun = sc.nextInt();
                sc.nextLine();

                Negara neg = new Negara(nama, jenis_kpem, nama_pem, tanggal, bulan, tahun);
                listNegara.add(neg);
            }
        }

        System.out.println(" ");
        for (Negara neg : listNegara) {
            neg.info();
        }

        sc.close();
    }
}
