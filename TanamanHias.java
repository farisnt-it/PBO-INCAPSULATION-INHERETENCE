package com.mycompany.pbotest3.model;

public class TanamanHias extends TanamanModel {
    private String warnaBunga;

    public TanamanHias(String nama, String jenis, int umur, String warnaBunga) {
        super(nama, jenis, umur);
        this.warnaBunga = warnaBunga;
    }

    public String getWarnaBunga() { return warnaBunga; }
    public void setWarnaBunga(String warnaBunga) { this.warnaBunga = warnaBunga; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Warna Bunga: " + this.warnaBunga);
    }
}
