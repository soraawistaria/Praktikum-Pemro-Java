package Modul2.PRAK201_2510817120002_AmaliaSoraya;

class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah_beli;
    private double total;
    private double diskon;

    Buah(String nama, double berat, double harga, double jumlah_beli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.jumlah_beli = jumlah_beli;
        this.total = harga * (jumlah_beli/berat);
    }

    public double getDiskon() {
        double diskon = 0;
        double total = 0;

        for(int i = 0; i < jumlah_beli/4; i++) {
            total += harga * (4/berat);
            diskon += total * 0.02;
        }

        return diskon;
    }

    public void info() {
        System.out.printf("" +
                "Nama Buah: %s" + this.nama +
                "Berat: %.1f\n" +
                "Harga: %.1f\n" +
                "Jumlah Beli: %.1f\n" +
                "Harga sebelum diskon: %.2f\n" +
                "Total diskon: %.2f\n" +
                "Harga setelah diskon: %.2f",
                this.nama, this.berat, this.harga, this.jumlah_beli, this.total, this.diskon, (this.total - this.diskon));
    }

//    public String getNama(){
//
//    }
//
//    public double getBerat() {
//
//    }
//
//    public double getHarga() {
//
//    }
//
//    public double getJumlahBeli() {
//
//    }
}
