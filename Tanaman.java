package com.mycompany.pbotest3;

import com.mycompany.pbotest3.model.TanamanModel;
import com.mycompany.pbotest3.service.TanamanService;
import java.util.ArrayList;
import java.util.Scanner;

public class Tanaman {
    public static void main(String[] args) {
        ArrayList<TanamanModel> koleksiTanaman = new ArrayList<>();
        TanamanService service = new TanamanService();
        Scanner input = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n===== MENU KOLEKSI TANAMAN =====");
            System.out.println("1. Tambah Tanaman");
            System.out.println("2. Lihat Tanaman");
            System.out.println("3. Ubah Tanaman");
            System.out.println("4. Hapus Tanaman");
            System.out.println("5. Cari Tanaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihan = input.nextInt();
                input.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Pilihan tidak valid, masukkan angka!");
                input.nextLine(); // Membersihkan input yang tidak valid dari scanner
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    TanamanModel baru = service.tambahTanaman(input);
                    if (baru != null) {
                        koleksiTanaman.add(baru);
                        System.out.println("✅ Tanaman berhasil ditambahkan!");
                    }
                    break;
                case 2:
                    service.lihatTanaman(koleksiTanaman);
                    break;
                case 3:
                    service.ubahTanaman(koleksiTanaman, input);
                    break;
                case 4:
                    service.hapusTanaman(koleksiTanaman, input);
                    break;
                case 5:
                    service.cariTanaman(koleksiTanaman, input);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    if (pilihan != 0) {
                        System.out.println("Pilihan tidak valid!");
                    }
            }
        } while (pilihan != 6);
    }
}
