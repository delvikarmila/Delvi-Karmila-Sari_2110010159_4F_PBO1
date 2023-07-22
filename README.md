# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Toko Sanken dan Data TokoSanken, dan memberikan output berupa informasi detail dari Kode barang tersebut seperti Nama Konsumen, Kode Pesanan, Tipe Barang. Nama Barang, Tipe Barang, Merk Barang
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Toko Sanken`, `DataTokoSanken`, dan `Main` adalah contoh dari class.

```bash
public class Toko Sanken {
    
}

public class DataTokoSanken extends TokoSanken{
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `("Delvi Karmila Sari", "102003", "Elektronik");` adalah contoh pembuatan object.

```bash
konsumen[i] = new DataTokoSanken(namakonsumen, kode, Tipe);
}
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namakonsumen` `kode`dan `tipebarang` adalah contoh atribut.

```bash
String namakonsumen;
String kode;
String tipebarang;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `TokoSanken` dan `DataTokoSanken`.

```bash
public TokoSanken (String namakonsumen, String kode, String tipebarang){
    this.namakonsumen = namakonsumen;
    this.kode = kode;
    this.tipebarang = tipebarang;
}

public DataTokoSanken(String namakonsumen, String kode, String tipebarang){
    super(namakonsumen,kode,tipebarang);

}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamakonsumen` `Kodepesanan` dan `setTipebarang` adalah contoh method mutator.

```bash
public void setNamakonsumen(String namakonsumen) {
        this.namakonsumen = namakonsumen;
    }

    public void setKodepesanan(String kode) {
        this.kode = kode;
    }

    public void setTipebarang(String tipebarang) {
        this.tipebarang = tipebarang;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamakonsumen`, dan  `getKodepesanan`adalah contoh method accessor.

```bash
 public String getNamakonsumen() {
        return namakonsumen;
    }

    public String getKodepesanan() {
        return kode;
    }

    public String getTipebarang() {
        return tipebarang;
    }

```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namakonsumen` `kode` dan `tipebarang` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namakonsumen;
private String kode;
private String tipebarang;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DataTokoSanken` mewarisi `Toko Sanken` dengan sintaks `extends`.

```bash
public class DataTokoSanken extends TokoSanken {
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `InfoTokoSanken(Tipe)` di `TokoSanken` merupakan overloading. method `InfoTokoSanken()` di `DataTokoSanken` merupakan override dari method `InfoTokoSanken(String Tipe)` di `Toko Sanken`.

```bash
public String infoTokoSanken( String Tipe){
         return infoTokoSanken()+ "\nTipe: "+Tipe;
    }    
    

@Override
public String infoTokoSanken(){
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodebarang`, dan seleksi `switch` dalam method ``getTipebarang` dan `getMerkbarang' `.

```bash
public String getKodeBarang(){
    String kodeBarang = getKodepesanan().substring(0, 1);
//seleksi if
if(kodeBarang.equals("1")){
    return "Tv";
} else if (kodeBarang.equals("2")){
    return "Speaker";
} else if (kodeBarang.equals("3")){
    return "Dispenser ";
} else if (kodeBarang.equals("4")){
    return "Kipas Angin";
} else if (kodeBarang.equals("5")){
    return "Kulkas";
}else{
    return "barang tidak ada";
}
}
public String getTipeBarang(){
    String kodeTipe = getKodepesanan().substring(1, 3);
 //seleksi switch
 switch (kodeTipe){
     case "01":
        return "TW-8661";
     case "02":
        return "TW-8662";
     case "03":
        return "TW-8663";
     case "04":
         return "TW-8664";
     case "05":
        return "TW-8665";
     case "06":
        return "TW-8666";
     default:
        return "Tipe barang tidak tersedia ";
        
 }
}
public String getMerkBarang(){
    String kodeMerk = getKodepesanan().substring(3, 6);
  switch(kodeMerk){
     case"001":
         return "Sanken";
     case"002":
         return "LG";
     case"003":
         return "Sharp";
     case"004":
         return "Sony";
     case"005":
         return "Xiomi";
     case"006":
         return "Samsung";
     default:
         return "Tidak tersedia merk lain";
               
  }     
      }

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<konsumen.length; i++){
    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("1.Masukkan Nama Konsumen: ");
    String namakonsumen = scanner.nextLine();
    System.out.print("2.Masukkan Kode Pesanan: ");
    String kode = scanner.nextLine();
    System.out.print("3.Masukkan Tipe Barang: ");
    String Tipe = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DataTokoSanken[] konsumen = new DataTokoSanken[2];` adalah contoh penggunaan array.

```bash
DataTokoSanken[] konsumen = new DataTokoSanken[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    
} 
}catch (NumberFormatException e){
     System.out.println("Kesalahan Format Nomor:"+e.getMessage()); 
}catch (IndexOutOfBoundsException e){
     System.out.println("Kesalahan Format Kode Pesanan:"+e.getMessage()); 
 }catch (Exception e){
     System.out.println("Kesalahan umum:"+e.getMessage()); 
 }
    }
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

Nama: Delvi Karmila Sari
NPM: 2110010159
