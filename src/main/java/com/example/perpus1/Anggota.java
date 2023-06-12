package com.example.perpus1;

public class Anggota {
    protected int idAnggota;
    protected String nama;
    protected String noTelp;

    public Anggota() {
    }

    public Anggota(int idAnggota, String nama, String noTelp) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
}
