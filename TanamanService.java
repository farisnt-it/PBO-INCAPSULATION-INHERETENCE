package com.mycompany.pbotest3.service;

import com.mycompany.pbotest3.model.TanamanModel;
import com.mycompany.pbotest3.model.TanamanHias;
import com.mycompany.pbotest3.model.TanamanBuah;
import java.util.ArrayList;
import java.util.Scanner;

public class TanamanService {
    public TanamanModel tambahTanaman(Scanner input) {
        System.out.println("\n--- Tambah Tanaman ---");
        System.out.println("Pilih jenis tanaman:");
        System.out.println("1. Tanaman Hias");
        System.out.println("2. Tanaman Buah");
        System.out.print("Pilihan: ");
        int jenisTanaman = 0;
        try {
            jenisTanaman = input.nextInt();
            input.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Pilihan tidak valid, silakan coba lagi.");
            input.nextLine();
            return null;
        }

        System.out.print("Masukkan nama tanaman: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jenis umum (misal: Bunga, Pohon): ");
        String jenis = input.nextLine();
        System.out.print("Masukkan umur tanaman (bulan): ");
        int umur = 0;
        try {
            umur = input.nextInt();
            input.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Umur harus berupa angka, penambahan dibatalkan.");
            input.nextLine();
            return null;
        }
        

        switch (jenisTanaman) {
            case 1:
                System.out.print("Masukkan warna bunga: ");
                String warnaBunga = input.nextLine();
                return new TanamanHias(nama, jenis, umur, warnaBunga);
            case 2:
                System.out.print("Masukkan musim panen: ");
                String musimPanen = input.nextLine();
                return new TanamanBuah(nama, jenis, umur, musimPanen);
            default:
                System.out.println("Pilihan jenis tanaman tidak valid.");
                return null;
        }
    }

    public void lihatTanaman(ArrayList<TanamanModel> koleksi) {
        if (koleksi.isEmpty()) {
            System.out.println("Belum ada data tanaman.");
        } else {
            System.out.println("\n=== Daftar Tanaman ===");
            for (int i = 0; i < koleksi.size(); i++) {
                System.out.println((i + 1) + ".");
                koleksi.get(i).tampilkanInfo();
                System.out.println("------------------");
            }
        }
    }

    public void ubahTanaman(ArrayList<TanamanModel> koleksi, Scanner input) {
        lihatTanaman(koleksi);
        if (!koleksi.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin diubah: ");
            int index = -1;
            try {
                index = input.nextInt();
                input.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Nomor tidak valid, perubahan dibatalkan.");
                input.nextLine();
                return;
            }

            if (index > 0 && index <= koleksi.size()) {
                TanamanModel t = koleksi.get(index - 1);

                System.out.print("Nama baru (" + t.getNama() + "): ");
                String nama = input.nextLine();
                if (!nama.isEmpty()) t.setNama(nama);
                
                System.out.print("Jenis baru (" + t.getJenis() + "): ");
                String jenis = input.nextLine();
                if (!jenis.isEmpty()) t.setJenis(jenis);
                
                System.out.print("Umur baru (" + t.getUmur() + "): ");
                String umurInput = input.nextLine();
                if (!umurInput.isEmpty()) {
                    try {
                        int umur = Integer.parseInt(umurInput);
                        t.setUmur(umur);
                    } catch (NumberFormatException e) {
                        System.out.println("Umur harus angka, perubahan umur dibatalkan!");
                    }
                }
                
                if (t instanceof TanamanHias) {
                    TanamanHias th = (TanamanHias) t;
                    System.out.print("Warna bunga baru (" + th.getWarnaBunga() + "): ");
                    String warna = input.nextLine();
                    if (!warna.isEmpty()) th.setWarnaBunga(warna);
                } else if (t instanceof TanamanBuah) {
                    TanamanBuah tb = (TanamanBuah) t;
                    System.out.print("Musim panen baru (" + tb.getMusimPanen() + "): ");
                    String musim = input.nextLine();
                    if (!musim.isEmpty()) tb.setMusimPanen(musim);
                }

                System.out.println("✅ Tanaman berhasil diubah!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    public void hapusTanaman(ArrayList<TanamanModel> koleksi, Scanner input) {
        lihatTanaman(koleksi);
        if (!koleksi.isEmpty()) {
            System.out.print("Pilih nomor tanaman yang ingin dihapus: ");
            int index = -1;
            try {
                index = input.nextInt();
                input.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Nomor tidak valid, penghapusan dibatalkan.");
                input.nextLine();
                return;
            }

            if (index > 0 && index <= koleksi.size()) {
                koleksi.remove(index - 1);
                System.out.println("✅ Tanaman berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    public void cariTanaman(ArrayList<TanamanModel> koleksi, Scanner input) {
        System.out.print("Masukkan keyword nama tanaman: ");
        String keyword = input.nextLine().toLowerCase();

        boolean found = false;
        System.out.println("\n=== Hasil Pencarian ===");
        for (TanamanModel t : koleksi) {
            if (t.getNama().toLowerCase().contains(keyword)) {
                t.tampilkanInfo();
                System.out.println("------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tanaman tidak ditemukan.");
        }
    }
}
