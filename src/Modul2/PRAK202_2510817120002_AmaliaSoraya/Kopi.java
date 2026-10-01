package Modul2.PRAK202_2510817120002_AmaliaSoraya;

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
        return String.format("%.2f", harga * 0.11);
    }

    public void info() {
        System.out.printf("Nama Kopi: %s\n" +
                "Ukuran: %s\n" +
                "Harga: Rp. %.1f",
                this.namaKopi, this.ukuran, this.harga);
    }
}
