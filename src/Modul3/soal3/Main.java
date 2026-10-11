package Modul3.soal3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> mlist = new ArrayList<Mahasiswa>();
        Scanner sc = new Scanner(System.in);

        int pilihan = 5;
        while (pilihan != 0) {
            System.out.print("\nMenu: \n" +
                                "1. Tambah Mahasiswa\n" +
                                "2. Hapus Mahasiswa berdasarkan NIM\n" +
                                "3. Cari Mahasiswa berdasarkan NIM\n" +
                                "4. Tampilkan Daftar Mahasiswa\n" +
                                "0. Keluar\n" +
                                "Pilihan: ");

            pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 0) {
                System.out.print("Terima kasih!");
                mlist.clear();

            } else if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM Mahasiswa: ");
                String nim = sc.nextLine();

                Mahasiswa mhs = new Mahasiswa(nama, nim);
                mlist.add(mhs);
                System.out.println("Mahasiswa " + mhs.getNama() + " ditambahkan.");

            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = sc.nextLine();

                boolean ada = false;
                for (int i = 0; i < mlist.size(); i++) {
                    if (mlist.get(i).getNim().equals(nim)) {
                        System.out.println("Mahasiswa dengan NIM " + mlist.get(i).getNim() + " dihapus.");
                        mlist.remove(i);
                        ada = true;
                        break;
                    }
                }

                if (!ada) {
                    System.out.println("Mahasiswa tidak ada.");
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nim = sc.nextLine();

                boolean ada = false;
                for (int i = 0; i < mlist.size(); i++) {
                    if (mlist.get(i).getNim().equals(nim)) {
                        mlist.get(i).info();
                        ada = true;
                        break;
                    }
                }

                if (!ada) {
                    System.out.println("Mahasiswa tidak ada.");
                }

            } else if (pilihan == 4) {
                for (Mahasiswa mhs : mlist) {
                    mhs.info();
                }

            } else {
                System.out.println("Menu tidak ada.");
                break;
            }
        }

        sc.close();
    }
}
