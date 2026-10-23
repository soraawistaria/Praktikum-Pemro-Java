package Modul4.soal2;

class Anjing extends HewanPeliharaan {
    private String warnabulu;
    private String[] kemampuan;

    Anjing(String nama, String ras, String warna, String[] kemampuan) {
        super(ras, nama);
        this.warnabulu = warna;
        this.kemampuan = kemampuan;
    }

        public void displayDetailAnjing() {
            super.display();
            System.out.println("Memiliki warna bulu : " + this.warnabulu);
            System.out.print("Memiliki kemampuan : ");
            for(String kmp : this.kemampuan) {
                System.out.print(kmp + " ");
            }
        }
}
