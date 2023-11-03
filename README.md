# Proyek-Akhir-PBO-dan-DBD-Kelompok-20
Tema pengelolaan wahana bermain dipilih karena pengelolaan wahana bermain memainkan peran penting dalam menjaga, meningkatkan, dan mengelola taman bermain agar dapat memberikan lingkungan yang aman, menyenangkan, dan memuaskan bagi pengunjung.

# Kelompok 20
## Nama Kelompok:
### - Dinda Nur Aini (2209116023)
### - Juventia Adelia Putri (2209116032)

# Flowchart

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/18c359c0-6c0c-4582-afc4-b0b63d1462cc)

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/99aa4f14-e243-4c99-a842-b51df29bfe29)

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/3752c6cd-f7a9-46a0-9e33-4dc3059b4e1e)

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/9960f880-bdcb-4785-877f-e60dd9d50b5c)


# Hirarki
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/e9d4f6ff-7715-4b8b-99ec-cdef41dfd0de)

(Override)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/2bb2cee7-3a95-4f5b-be23-fe481220db26)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/6c06e3a8-2889-4c21-a124-0c6fb8de83ac)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/4ac21ca7-67d1-4dde-b404-fa4635a1a8cf)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/29f496b0-4013-4a74-95d4-77161f5ee72e)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/de3742c1-ca2c-4451-8de7-f6bfedb0c8f6)

# ERD

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/2ae304bb-88a5-4486-b7a1-9eaaf383b123)

# Tampilan Package
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/92a917dd-e9b1-4318-8e8f-65592bc06a28)


# Kodingan

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/6c2f873c-4c5e-4855-8fb8-a5ac03e0914e)

Package controller digunakan untuk mengelompokkan kelas-kelas terkait pengontrolan atau kontrol dari aplikasi.
Import dilakukan untuk menggunakan kelas-kelas dari paket lain seperti kelas implementWahana_bermain, database, ArrayList, Logger, dan lainnya.


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/b72e5751-1f26-4c5d-9bde-1a70c7b884c8)

Kelas wahana_bermain mengimplementasikan interface implementWahana_bermain.


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/585c6fa1-ad9d-45e3-81aa-30ee16daecf1)

Connection connection;: Merepresentasikan koneksi ke database.
final String insert = "INSERT INTO ...";: Query SQL untuk operasi insert data.
final String update = "UPDATE ...";: Query SQL untuk operasi update data.
final String delete = "DELETE FROM ...";: Query SQL untuk operasi hapus data.
final String select = "SELECT * FROM ...";: Query SQL untuk operasi select data.
final String Search = "SELECT * FROM ...";: Query SQL untuk pencarian data berdasarkan nama wahana.


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/b175b782-c429-4e6d-adc2-aed815cdcf68)

Konstruktor kelas wahana_bermain yang melakukan inisialisasi koneksi dengan menggunakan metode configDB dari kelas database.

# Output

## Register

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/1531c679-360a-4246-8157-70b8127e296e)


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/470c6d7c-980d-492e-80c1-8403c53d8b1c)

### Tampilan Register Berhasil

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/5a1f0e76-431b-4334-b883-d5ce431cecf1)




## Login

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/03bc1666-cd23-477c-8e1c-a429df8cc09c)


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/43f88a68-1bfc-4899-b1a0-bd1233271a3d)


### Tampilan Login Berhasil
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/ebe1d334-38b5-4887-936e-573e787b654b)



### Tampilan Login Gagal
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/cfd92cb5-42b0-43d6-bd54-df9f2dccfd97)


## Menu Utama

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/709ce34c-dd89-4694-b15d-27cef4061075)

## Menu Wahana


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/b1df4fcb-3d83-4d09-a7a9-dbf71b77ecbb)

### Tampilan Berhasil Menambah

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/80a3ce9c-35c9-47e6-87f4-e5d0bf6774a7)


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/5dd37f5f-96d5-425e-a137-f8b2461c906d)

### Update Wahana

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/a80e54a9-aa83-4cf0-a825-cf4e859ece6e)

### Tampilan Berhasil Update

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/94e78bfb-43a9-4f29-bccf-4c2b30cea687)


![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/70a3c238-3a0f-496d-950b-d660ba317025)

### Hapus Wahana

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/ab893461-d9b2-4a43-8bd5-f3d177d0c498)

### Tampilan Berhasil Hapus

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/4044d1ff-1d8a-497e-8290-4b6883cf534f)

![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127454468/13d27427-68ae-4d73-bb2b-7a9e036e8180)

### Menu Karyawan
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/11c8f86e-ff1b-4548-95e0-2df25d476cdc)

### Menu Tambahkan Karyawan
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/f3688432-6569-4ba7-b340-f40edfba3b6f)

### Isi Data
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/feb7636e-1fea-47bc-b2c8-581e46188571)

### Menu Create
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/f32573e6-baf1-4831-ad56-403c4e8d0561)

### Menu Read
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/5eb4c95c-e6ef-4b92-b633-00d7757bc0f9)

### Menu Update
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/3abac25a-b285-4c82-82f4-01aeb3156782)

### Menu Delete
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/22c4c09d-215c-49d5-81bb-f9f235a26793)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/af31e818-1863-4acb-b6e7-8354628dac9e)

### Package Kontrol
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/4050205b-34b5-4f6c-9890-62093da03ce0)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/2d5d3921-929e-4076-8b70-b32acb4a0df8)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/fb514ece-46e7-4393-a220-4375276ea14c)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/4c2ad512-a256-41cd-84d7-d8bb7d691df3)

### Getter dan Setter
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/8e7307da-1b9d-4981-90d9-54db8e39551f)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/0de017a4-3860-41ce-8720-e51d331f4083)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/22b39872-7f48-4263-b7e7-02f0c894c767)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/d2bb2b8c-6173-4d86-9a29-7cf123db57e3)\

### Interface
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/14c783ef-2cad-44b0-b40c-1b6cfe221e07)
![image](https://github.com/PA-DBD-PBO/Proyek-Akhir-PBO-dan-DBD-Kelompok-20/assets/127497778/cb35a95b-3e97-45eb-a66c-c7291f801bc8)












