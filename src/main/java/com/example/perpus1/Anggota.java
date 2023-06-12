package com.example.perpus1;

public class Anggota {
    protected String idAnggota;
    protected String nama;
    protected String noTelp;

    public Anggota() {
    }

    public Anggota(String idAnggota, String nama, String noTelp) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setIdAnggota(String idAnggota) {
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
