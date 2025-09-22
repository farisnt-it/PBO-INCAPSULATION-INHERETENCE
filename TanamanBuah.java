package com.mycompany.pbotest3.model;

public class TanamanBuah extends TanamanModel {
    private String musimPanen;

    public TanamanBuah(String nama, String jenis, int umur, String musimPanen) {
        super(nama, jenis, umur);
        this.musimPanen = musimPanen;
    }

    public String getMusimPanen() { return musimPanen; }
    public void setMusimPanen(String musimPanen) { this.musimPanen = musimPanen; }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Musim Panen: " + this.musimPanen);
    }
}
