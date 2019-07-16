package com.pens.recyclerview;

public class Mahasiswa {
    private String nama;
    private String nrp;
    private String nohp;

    public Mahasiswa(String nama, String nrp, String nohp) {
        this.nama = nama;
        this.nrp = nrp;
        this.nohp = nohp;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNrp() {
        return this.nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNohp() {
        return this.nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

}
