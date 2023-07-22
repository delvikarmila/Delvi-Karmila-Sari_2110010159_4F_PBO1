
package PBO;
//intheritance
public class DataTokoSanken extends TokoSanken {
//overriding
public DataTokoSanken(String namakonsumen, String kode, String tipebarang){
    super(namakonsumen,kode,tipebarang);
}

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
 //polymorphism (overriding)
 public String infoTokoSanken(){
    return super.infoTokoSanken()+
        "\n Nama Barang: "+getKodeBarang()+
        "\n Tipe Barang: "+getTipeBarang()+
        "\n Merk Barang: "+getMerkBarang();
    }
}