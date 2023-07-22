
package PBO;

// class
public class TokoSanken {
// atribut dan encapsulation
private String namakonsumen;
private String kode;
private String tipebarang;

//constructor
    public TokoSanken (String namakonsumen, String kode, String tipebarang){
    this.namakonsumen = namakonsumen;
    this.kode = kode;
    this.tipebarang = tipebarang;
}

//accsesor (getter)
    public String getNamakonsumen() {
        return namakonsumen;
    }

    public String getKodepesanan() {
        return kode;
    }

    public String getTipebarang() {
        return tipebarang;
    }
    public String infoTokoSanken(){
        return "Nama Konsumen: "+getNamakonsumen()+
                "\nKode Pesanan: "+getKodepesanan()+
                "\nTipe Barang: "+getTipebarang();
    }


// mutator (setter)
    public void setNamakonsumen(String namakonsumen) {
        this.namakonsumen = namakonsumen;
    }

    public void setKodepesanan(String kode) {
        this.kode = kode;
    }

    public void setTipebarang(String tipebarang) {
        this.tipebarang = tipebarang;
    }
 //polymorphism (overloading)
     public String infoTokoSanken( String Harga){
         return infoTokoSanken()+ "\nHarga: "+Harga;
    }    
    
}

