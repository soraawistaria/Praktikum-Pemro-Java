package Modul2.PRAK202_2510817120002_AmaliaSoraya;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Kopi kopi1 = new Kopi();
        kopi1.namaKopi = "Espresso";
        kopi1.ukuran = "Medium";
        kopi1.harga = 25000;
        kopi1.info();

        kopi1.setPembeli("Alice");

        Locale.setDefault(Locale.US);
        System.out.printf("Pembeli Kopi: %s\n", kopi1.getPembeli());
        System.out.printf("Pajak Kopi: Rp. %s", kopi1.getPajak());
    }
}
