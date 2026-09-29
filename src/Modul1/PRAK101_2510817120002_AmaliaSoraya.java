package Modul1;

import java.util.Scanner;

public class PRAK101_2510817120002_AmaliaSoraya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String birthplace = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int birthdate = scanner.nextInt();

        if(birthdate > 31 || birthdate < 1) {
            System.out.println("tanggal ga valid!");
            System.exit(0);
        }

        System.out.print("Masukkan Bulan Lahir: ");
        int month = scanner.nextInt();

        if(month < 1 || month > 12) {
            System.out.println("bulan ga valid!");
            System.exit(0);
        }

        System.out.print("Masukkan Tahun Lahir: ");
        int year = scanner.nextInt();

        if(month == 2 && birthdate > 29 && year % 4 == 0) {
            System.out.println("tanggal tidak valid untuk tahun kabisat");
            System.exit(0);
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int height = scanner.nextInt();

        if(height < 0 || height > 300) {
            System.out.println("tinggi tidak normal");
            System.exit(0);
        }

        System.out.print("Masukkan Berat Badan: ");
        double weight = scanner.nextDouble();

        if(weight < 0) {
            System.out.println("BB tidak normal");
            System.exit(0);
        }

        String month_name = switch(month) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "???";
        };

        System.out.print("\nNama Lengkap " + name + ", Lahir di " + birthplace);
        System.out.println(" pada Tanggal " + birthdate + " " + month_name + " " + year);
        System.out.println("Tinggi Badan " + height +" cm dan Berat Badan " + weight + " kilogram");

        scanner.close();
    }
}