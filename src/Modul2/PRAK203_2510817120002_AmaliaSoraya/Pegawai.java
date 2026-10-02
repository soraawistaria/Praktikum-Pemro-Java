package Modul2.PRAK203_2510817120002_AmaliaSoraya;

//class harusnya bernama Pegawai, bukan Employee
//public class Employee {}
public class Pegawai {
    public String nama;

    // seharusnya tipe data String, bukan char
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
//        tidak sepenuhnya salah, tapi sebaiknya pakai this. agar tidak bingung
//        return nama;
        return this.nama;

    };

    public String getAsal() {
//        tidak sepenuhnya salah, tapi sebaiknya pakai this. agar tidak bingung
//        return asal;
        return this.asal;
    }

    // method ini harusnya ada parameter j
//    public void setJabatan() {
//        this.jabatan = j;
//    }
    public void setJabatan(String j){
        this.jabatan = j;
    }
}
