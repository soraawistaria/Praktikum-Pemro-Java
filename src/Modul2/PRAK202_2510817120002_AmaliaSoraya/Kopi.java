package Modul2.PRAK202_2510817120002_AmaliaSoraya;

import java.util.Locale;

public class Kopi {
    public String namaKopi;
    public String ukuran;
    public double harga;
    public String pembeli;

    public void setPembeli(String pembeli){
        this.pembeli = pembeli;
    }

    public String getPembeli() {
        return this.pembeli;
    }

    public String getPajak() {
        return String.format("%.1f", harga * 0.11);
    }

    public void info() {
        Locale.setDefault(Locale.US);
        System.out.printf("Nama Kopi: %s\n" +
                "Ukuran: %s\n" +
                "Harga: Rp. %.1f\n",
                this.namaKopi, this.ukuran, this.harga);
    }
}
