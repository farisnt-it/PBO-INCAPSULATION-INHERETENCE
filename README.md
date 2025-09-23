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

<img width="553" height="299" alt="Screenshot 2025-09-23 104056" src="https://github.com/user-attachments/assets/3e0cbae6-07be-4604-a812-6abcb94d71bd" />


## Fitur & Contoh Input/Output

- **Tampilan Menu Utama**  
  User diberikan 6 pilihan menu: Tambah Tanaman, Lihat Tanaman, Ubah Tanaman, Hapus Tanaman, Cari Tanaman, atau Keluar.  

<img width="516" height="195" alt="Screenshot 2025-09-23 104141" src="https://github.com/user-attachments/assets/8f9b2d76-0fab-4d4e-9ea6-cdd11da02919" />

- **Tambah Tanaman (Create)**
  Skenario Sukses:

   -Pengguna memilih 1. Tambah Tanaman.
   -Program meminta pengguna untuk memilih jenis tanaman (Hias atau Buah).
   -Setelah jenis dipilih, pengguna diminta untuk memasukkan detail (nama, jenis, umur).
   -Untuk TanamanHias, diminta warnaBunga. Untuk TanamanBuah, diminta musimPanen.
   -Setelah semua input valid, data akan disimpan ke ArrayList.

  
<img width="700" height="470" alt="Screenshot 2025-09-23 104337" src="https://github.com/user-attachments/assets/f35f9c37-d9c1-4312-9774-9344e80d1a2a" />

---

<img width="788" height="570" alt="Screenshot 2025-09-23 104601" src="https://github.com/user-attachments/assets/20f4a7e1-181a-4ccb-b896-dfb227ad4b12" />

---

Skenario Gagal:

Jika pengguna memasukkan input non-angka untuk umur, program akan menampilkan pesan kesalahan dan melakukan looping hingga input yang benar diberikan.

<img width="627" height="483" alt="Screenshot 2025-09-23 104810" src="https://github.com/user-attachments/assets/427121d2-bf06-40c8-a054-e60baeac7274" />

- **Lihat Tanaman (Read)**  
  - Jika daftar kosong → tampil pesan *"Belum ada tanaman"*.
    
    <img width="431" height="462" alt="image" src="https://github.com/user-attachments/assets/d29d0b82-a2a0-4b65-bc32-daf507557c2b" />
    
  - Jika ada → tampil semua tanaman dengan format:
   
   <img width="595" height="610" alt="image" src="https://github.com/user-attachments/assets/96be895c-d850-4024-9898-44c261072ec8" />

- **Ubah Tanaman (Update)**  
  - Cari tanaman berdasarkan nomor urut.  
  - Jika ketemu → user bisa mengganti data tanaman di koleksi.
  - User bisa mengupdate data dari suatu tanaman yang sudah dimasuki dengan cara memasuki menginput Nama, Jenis, Umur baru, dll untuk tanaman tersebut
 
    <img width="544" height="543" alt="image" src="https://github.com/user-attachments/assets/a8f0dcd9-2919-4f1d-b92f-4a073525bbcf" />
    
  - Jika tidak → tampil pesan *"Tanaman tidak ditemukan"*.
 
    <img width="589" height="443" alt="image" src="https://github.com/user-attachments/assets/ab18e1e8-a543-44b6-b440-530aa4cbc643" />

- **Hapus Tanaman (Delete)**  
  - Cari tanaman berdasarkan nomor urut.  
  - Jika ketemu → tanaman dapat dihapus dari daftar.
  - Dengan user memasukan nomor tanaman yang ingin di hapus
 
    <img width="554" height="443" alt="image" src="https://github.com/user-attachments/assets/94c596d9-b637-4517-9146-47c5ec694205" />

  - Jika tidak ditemukan → tampil pesan *"Nomor tidak valid"*.
    
   <img width="472" height="224" alt="image" src="https://github.com/user-attachments/assets/ed9975e8-a2ad-4b1c-b2a9-dfd8a7fca1e3" />

- **Cari Tanaman (Search)**  
  - User memasukkan keyword nama.  
  - Jika ada → tampil data tanaman yang sesuai.
    
    <img width="423" height="366" alt="image" src="https://github.com/user-attachments/assets/8c0c494d-7427-47b9-9099-6f55969c1b5a" />

  - Jika tidak → tampil pesan *"Tanaman tidak ditemukan"*.
 
    <img width="402" height="216" alt="image" src="https://github.com/user-attachments/assets/c5f6504c-e78e-48ba-b968-f572c9900ee1" />

- **Keluar Program**  
  Program berhenti saat user memilih menu `6`.
  
<img width="729" height="379" alt="image" src="https://github.com/user-attachments/assets/44b9c96d-c1ad-458b-ae9e-65e80bf24c92" />




   




