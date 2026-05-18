package model;

    // PILAR - encapsulation 
    // semua field private, hanya bisa diakses melalui setter & getter 
    // berlaku juga di class lain 

public class Kamar {
    private int idKamar;
    private String nomorKamar;
    private double harga;
    private String status; 
    
    //  intinya buat wadah dulu, isi nya masih kosong, di isi nanti
    public Kamar(){}
    
    // constructor kalo ini yg pas bikin objek langsung ada isi nya
    public Kamar(int idKamar, String nomorKamar, double harga, String status) {
        this.idKamar = idKamar;
        this.nomorKamar = nomorKamar;
        this.harga = harga;
        this.status = status;
    }
    
    // getter, ambil harga kamar karena modifier nya private 
    public int getIdKamar() {return idKamar;}
    public String getnomorKamar () {return nomorKamar;}
    public double getHarga() {return harga;}
    public String getStatus() {return status;}
    
    // setter, pake void karena ini mau isi nilai ke variabel
    // tidak mengembalikan nilai apa apa
    public void setIdKamar(int idKamar) {
        this.idKamar = idKamar; 
    }
    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
    public boolean isTersedia() {
        return "tersedia".equalsIgnoreCase(status);
        // ini buat ngecek kamar nya tersedia atau tidak
        // equals blablabla kalo di data "TERSEDIA" atau "tersedia", ttp dianggap sama
    }
    
    @Override
    public String toString() {
        return nomorKamar + " - Rp" + String.format("%,.0f", harga);
    }
    
    
}