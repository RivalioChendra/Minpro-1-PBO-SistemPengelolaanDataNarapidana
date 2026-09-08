# Sistem Pengelolaan Data Narapidana

**Nama**: Rivalio Chendra   
**NIM** : 2509116039  
**Kelas**: A  
**Praktikum**: Pemrograman Berorientasi Objek

## 1. Deskripsi Program  
Program ini digunakan untuk mencatat data narapidana yang ada di dalam sebuah Lapas, meliputi ID, nama, kasus, masa tahanan, dan nomor sel yang ditempati. Program juga menyediakan data pendukung berupa daftar sel yang tersedia di Lapas.

Fitur utama program ini adalah CRUD (Create, Read, Update, Delete) terhadap data narapidana:
| Fitur | Keterangan |
|---|---|
| Create | Menambahkan data narapidana baru |
| Read | Menampilkan seluruh data narapidana yang tersimpan |
| Update | Mengubah nomor sel milik narapidana tertentu |
| Delete | Menghapus data narapidana berdasarkan ID |  

## 2. Alur Program
Program ini terdiri dari 4 file/class:  
### Struktur Project

```text
model/
├── Narapidana.java   -> Class entitas data narapidana
└── Sel.java          -> Class entitas data sel
admin/
└── AdminLapas.java   -> Class pengelola data (menyimpan
                         ArrayList dan seluruh logika CRUD)
Main.java             -> Class entry point (tampilan
                         menu program)
```

**a. Narapidana (model)** Merepresentasikan satu data narapidana. Memiliki atribut idNapi, nama, kasus, masaTahanan, dan nomorSel, beserta constructor untuk membuat objek baru, dan method getter/setter untuk mengakses atributnya.

**b. Sel (model)** Merepresentasikan satu data sel tahanan. Memiliki atribut nomorSel, blok, dan kapasitas, beserta constructor dan method getter.

**c. AdminLapas (pengelola)** Class ini berguna menyimpan seluruh data (lewat ArrayList<Narapidana> dan ArrayList<Sel>) serta menjalankan seluruh proses CRUD. Class ini juga memegang objek Scanner sehingga setiap method yang membutuhkan input dari pengguna (Tambah, Hapus, Update) membaca input-nya secara langsung di dalam method masing-masing.

**d. Main (entry point)** Titik awal program dijalankan. Berisi tampilan menu, perulangan while agar program terus berjalan sampai pengguna memilih keluar, serta percabangan switch untuk memilih menu mana yang akan dijalankan.

### Alur Menjalankan Program
- Program dimulai dari main() di class Main, lalu membuat objek AdminLapas beserta beberapa data awal.
- Program masuk ke perulangan while yang menampilkan menu dan menerima pilihan pengguna secara terus-menerus.
- Setiap pilihan menu (1–6) diarahkan lewat percabangan switch ke method yang sesuai di AdminLapas: Tambah, Tampilkan, Hapus, Update, Tampilkan Sel, atau Keluar.
- Khusus fitur Hapus dan Update, program mencari data berdasarkan ID menggunakan boolean ditemukan. Jika ID tidak ada, muncul pesan error; jika ada, data diproses.
- Program terus berulang sampai pengguna memilih menu Keluar, yang mengubah berjalan menjadi false dan menghentikan perulangan while.

### Dokumentasi Program  
Berikut adalah dokumentasi alur program, mulai dari tampilan awal sampai proses CRUD dijalankan.  
- **Tampilan Menu Utama**   
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/bb9a5262b3f0c8688ccadd3e5b31566cd85f2753/minpro1/Screenshot%202026-09-08%20160203.png)  
  Ini adalah tampilan awal saat program dijalankan. Program menampilkan daftar menu (Tampilkan napi, tampilkan sel, tambahkan napi, update, hapus, Keluar) dan menunggu
  pengguna memasukkan pilihan angka.   


- **Menampilkan Narapidana**   
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/970f2b988a5de584d58ab8fc24b341eb9f391fc3/minpro1/Screenshot%202026-09-08%20161638.png)  
  Jika pengguna memasukkan pilihan 1, maka sistem akan menampilkan semua data Narapidana yang ada.    
  

- **Menampilkan Sel**  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/8db45f4600711aec40e780a97944d46f96e5933e/minpro1/Screenshot%202026-09-08%20161942.png)   
  Jika pengguna memasukkan pilihan 2, maka sistem akan menampilkan semua sel yang ada.    


- **Menambah Narapidana**  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/e86b0c879d4c839632f9e5b1d391b22bcd1d4120/minpro1/Screenshot%202026-09-08%20162351.png)  
  Jika pengguna memasukkan pilihan 3, maka sistem akan meminta ID Baru untuk napi, nama, kasus, masa tahanan, dan nomor sel tempat narapidana di kurung, jika input berhasil     maka akan muncul pesan "Data narapidana berhasil ditambahkan"
  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/e86b0c879d4c839632f9e5b1d391b22bcd1d4120/minpro1/Screenshot%202026-09-08%20162634.png)   
  Jika di cek menggunakan pilihan 1, maka dapat terlihat data narapidana yang baru ditambahkan.      

- **Update Data Sel Narapidana**  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/103d9541650dc4ebf2350557366a5ca1a5ef49c9/minpro1/Screenshot%202026-09-08%20163350.png)  
  Jika pengguna memasukkan pilihan 4, maka akan diminta mengisi ID napi yang ingin di ubah, serta nomor sel barunya. Sebagai contoh disini saya ingin mengubah napi
  dengan id N003 yang awalnya berada di sel A2 menjadi A1.    

  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/103d9541650dc4ebf2350557366a5ca1a5ef49c9/minpro1/Screenshot%202026-09-08%20163412.png)  
  Ketika dicek dapat terlihat bahwa sel telah terubah menjadi A1.     


- **Hapus Narapidana**  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/103d9541650dc4ebf2350557366a5ca1a5ef49c9/minpro1/Screenshot%202026-09-08%20163528.png)  
  Jika pengguna memilih opsi 5, maka sistem akan meminta ID dapi yang ingin di hapus, jika ID yang dimasukan ada maka akan muncul pesan bahwa napi berhasil di hapus,
  sebagai contoh disini saya akan menghapus napi dengan ID N002.
  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/103d9541650dc4ebf2350557366a5ca1a5ef49c9/minpro1/Screenshot%202026-09-08%20163547.png)  
  Dapat terlihat bahwa napi dengan ID N002 telah hilang.     


- **Keluar Dari Program**  
  ![image alt](https://github.com/RivalioChendra/pbo_prak/blob/103d9541650dc4ebf2350557366a5ca1a5ef49c9/minpro1/Screenshot%202026-09-08%20163605.png)  
  Jika pengguna memasukkan opsi 6, maka sistem akan terhenti.  

  

  





