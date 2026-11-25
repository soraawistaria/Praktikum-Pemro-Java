package application;

public class Mahasiswa {
	private int id;
	private String nama;
	private String nim;
	
	Mahasiswa(int id, String nama, String nim) {
		this.id = id;
		this.nama = nama;
		this.nim = nim;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return nim;
	}
}