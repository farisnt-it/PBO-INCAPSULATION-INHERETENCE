# Manajemen Koleksi Tanaman

## Deskripsi Proyek
Proyek ini adalah aplikasi konsol sederhana berbasis **Java** yang berfungsi untuk mengelola koleksi tanaman.  
Pengguna dapat melakukan operasi dasar **CRUD** (Create, Read, Update, Delete) serta mencari data tanaman dalam koleksi.  

Aplikasi ini dibangun untuk mendemonstrasikan penerapan konsep-konsep dasar **Pemrograman Berorientasi Objek (PBO)**.  

---

## Konsep PBO yang Diterapkan

1. **Encapsulation (Enkapsulasi)**  
   Setiap kelas model (`TanamanModel`, `TanamanHias`, `TanamanBuah`) memiliki atribut `private`.  
   Akses dan modifikasi data hanya melalui **getter** dan **setter**, sehingga integritas data lebih terjaga.  

2. **Inheritance (Pewarisan)**  
   `TanamanModel` berfungsi sebagai **superclass** (kelas induk).  
   `TanamanHias` dan `TanamanBuah` adalah **subclass** yang mewarisi atribut dan metode dari `TanamanModel`.  
   Masing-masing subclass memiliki atribut tambahan, misalnya:  
   - `TanamanHias` → `warnaBunga`  
   - `TanamanBuah` → `musimPanen`  

3. **Overriding (Penimpaan)**  
   Metode `tampilkanInfo()` ditimpa (override) di `TanamanHias` dan `TanamanBuah`.  
   Dengan overriding, setiap subclass dapat menampilkan informasi unik sesuai jenis tanaman masing-masing.  

---

## Struktur Proyek
