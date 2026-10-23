package Modul4.soal2;

class HewanPeliharaan {
    private String nama;
    private String ras;

    HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }

    public void display() {
        System.out.println("Detail Hewan Peliharaan: ");
        System.out.println("Nama hewan peliharaanku adalah : " + this.nama);
        System.out.println("Dengan ras : " + this.ras);
    }
}
