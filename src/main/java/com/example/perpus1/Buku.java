package com.example.perpus1;

public class Buku {
    protected int idBuku, tahunTerbit;
    protected String judul, pengarang, penerbit, jenisBuku;

    public Buku() {
    }

    public Buku(int idBuku, int tahunTerbit, String judul, String pengarang, String penerbit, String jenisBuku) {
        this.idBuku = idBuku;
        this.tahunTerbit = tahunTerbit;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.jenisBuku = jenisBuku;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getJenisBuku() {
        return jenisBuku;
    }

    public void setJenisBuku(String jenisBuku) {
        this.jenisBuku = jenisBuku;
    }
}
