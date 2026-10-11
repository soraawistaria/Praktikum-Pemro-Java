package Modul3.soal3;

public class Mahasiswa {
    private String nama;
    private String nim;

    Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public void info() {
        System.out.println("NIM: " + this.nim + ", Nama: " + this.nama);
    }
}
