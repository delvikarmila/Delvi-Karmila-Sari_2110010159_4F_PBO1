package PBO;

import java.util.Scanner;
public class Main {
    
public static void main(String[] args) {
    //object
    //Toko Sanken = new Toko ("Delvi Karmila Sari", "102003", "Elektronik");
     //System.out.println(toko.infoTokoSanken());
     //System.out.println(toko.infoTokoSanken("500000));

 //error handling
 try{
// IO sederhana
Scanner scanner = new Scanner(System.in);

//array
DataTokoSanken[] konsumen = new DataTokoSanken[2];

//Perulangan
for(int i=0; i<konsumen.length; i++){
    System.out.print("1.Masukkan Nama Konsumen: ");
    String namakonsumen = scanner.nextLine();
    System.out.print("2.Masukkan Kode Pesanan: ");
    String kode = scanner.nextLine();
    System.out.print("3.Masukkan Tipe Barang: ");
    String Harga = scanner.nextLine();
    
 //objek
 konsumen[i] = new DataTokoSanken(namakonsumen, kode, Harga);
}
//perulangan
for (DataTokoSanken data: konsumen){
    System.out.println("====================");
    System.out.println("Data Konsumen Toko: ");
    System.out.println(data.infoTokoSanken());
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
