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
- Tampilan Menu Utama
  



