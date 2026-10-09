package Modul3.soal1;

public class Dadu {

    private int totalNilai = 0;

    public int acakNilai() {
        int randomDadu = (int) ((Math.random() * 5) + 1);
        this.totalNilai += randomDadu;
        return randomDadu;
    }

    public int getTotalNilai() {
        return this.totalNilai;
    }
}
