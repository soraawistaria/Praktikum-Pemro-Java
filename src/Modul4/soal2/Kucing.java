package Modul4.soal2;

public class Kucing extends HewanPeliharaan {
    private String warnabulu;

    Kucing(String ras, String nama, String warna) {
        super(ras, nama);
        this.warnabulu = warna;
    }

    public void displayDetailKucing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + this.warnabulu);
    }
}
