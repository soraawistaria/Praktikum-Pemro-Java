package Modul3.soal2;

import java.util.HashMap;

public class Negara {
    private String nama_neg;
    private String jenis_kpem;
    private String nama_pem;
    private int tanggal;
    private int bulan;
    private int tahun;

    private static HashMap<Integer, String> listBulan = new HashMap<Integer, String>();
    static {
        listBulan.put(1, "Januari");
        listBulan.put(2, "Februari");
        listBulan.put(3, "Maret");
        listBulan.put(4, "April");
        listBulan.put(5, "Mei");
        listBulan.put(6, "Juni");
        listBulan.put(7, "Juli");
        listBulan.put(8, "Agustus");
        listBulan.put(9, "September");
        listBulan.put(10, "Oktober");
        listBulan.put(11, "November");
        listBulan.put(12, "Desember");
    }

    Negara(String nama, String jenis, String nama_pem) {
        this.nama_neg = nama;
        this.jenis_kpem = jenis;
        this.nama_pem = nama_pem;
    }

    Negara(String nama, String jenis, String nama_pem,
           int tanggal, int bulan, int tahun) {
        this.nama_neg = nama;
        this.jenis_kpem = jenis;
        this.nama_pem = nama_pem;
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    private String kapital(String teks) {
        String[] kata = teks.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String k : kata) {
            sb.append(Character.toUpperCase(k.charAt(0)))
                    .append(k.substring(1))
                    .append(" ");
        }
        return sb.toString().trim();
    }

    public void info() {
        if(jenis_kpem.equals("monarki")) {
            System.out.println("Negara " + this.nama_neg +
                    " mempunyai Raja bernama " + this.nama_pem );
        } else {
            System.out.println("Negara " + this.nama_neg +
                    " mempunyai " + kapital(this.jenis_kpem) +
                    " bernama " + this.nama_pem);

            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + this.tanggal +
                    " " + listBulan.get(this.bulan) + " " + this.tahun);
        }
    }
}
