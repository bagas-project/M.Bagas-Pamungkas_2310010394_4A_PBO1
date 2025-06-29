# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Handphone menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Merek Handphone, RAM, penyimpanan dan OS yang digunakan serta memberikan output berupa informasi detail handphone tersebut memiliki spesifikasi yang tinggi ataupun standar

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Handphone`, `Smartphone`, dan `HandphoneBeraksi` adalah contoh dari class.

```bash
public class Handphone {
    ...
}

public class Smartphone extends Handphone {
    ...
}

public class HandphoneBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `daftarHp[index] = new Smartphone(merek, ram, storage, os);` adalah contoh pembuatan object.

```bash
daftarHp[index] = new Smartphone(merek, ram, storage, os);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merek`, `ram`, `storage`dan `os` dan adalah contoh atribut.

```bash
private String merek;
private int ram;
private int storage;
private String os;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Handphone` dan `Smartphone`.

```bash
public Handphone(String merek, int ram, int storage) {
}

public Smartphone(String merek, int ram, int storage, String os) {
    super(merek, ram, storage);
    this.os = os;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setRam` , `setStorage` dan `setOs` adalah contoh method mutator.

```bash
public void setRam(int ram) {
    this.ram = ram;
}

public void setStorage(int storage) {
    this.storage = storage;
}

public void setOs(String os) {
    this.os = os;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getRam`, dan `getOs` adalah contoh method accessor.

```bash
public int getRam() {
    return ram;
}

public String getOs() {
    return os;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merek` , `ram` , `storage` dam `os` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merek;
private String ram;
private String storage;
private String os;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Smartphone` mewarisi `Handphone` dengan sintaks `extends`.

```bash
public class Smartphone extends Handphone {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo()` di `Handphone` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `Smartphone` merupakan override dari method `tampilkanInfo` di `Handphone`.

```bash
public void tampilkanInfo() {
 System.out.println("Merek: " + merek);
 System.out.println("RAM: " + ram + " GB");
 System.out.println("Storage: " + storage + " GB");
}

@Override
public void tampilkanInfo() {
 super.tampilkanInfo();
 System.out.println("Operating System: " + os);
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if ` dalam method `main`.

```bash
System.out.println("\n=== Daftar Handphone ===");
 for (Smartphone hp : daftarHp) {
      hp.tampilkanInfo();
      System.out.println("---");
                
      // Seleksi: tampilkan jika RAM di atas 4GB
      if (hp.getRam() > 4) {
          System.out.println("Ini adalah handphone spek tinggi!\n");
      }
 }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (Smartphone hp : daftarHp) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Merek: ");
String merek = scanner.nextLine();
                    
System.out.print("Masukkan RAM (GB): ");
int ram = Integer.parseInt(scanner.nextLine());
                    
System.out.print("Masukkan Storage (GB): ");
int storage = Integer.parseInt(scanner.nextLine());
                    
System.out.print("Masukkan OS: ");
String os = scanner.nextLine();

System.out.println("\n=== Daftar Handphone ===");
System.out.println(hp.tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Smartphone[] daftarHp = new Smartphone[3];` adalah contoh penggunaan array.

```bash
Smartphone[] daftarHp = new Smartphone[3];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    int ram = Integer.parseInt(scanner.nextLine());
} catch (NumberFormatException e) {
    System.out.println("Input angka tidak valid. Silakan coba lagi.");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: M.Bagas Pamungkas
NPM: 2310010394
