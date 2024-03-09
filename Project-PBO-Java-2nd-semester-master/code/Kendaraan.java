
public class Kendaraan {
    String nomorKendaraan;
    int harga;
    
    public Kendaraan(String nomorKendaraan, int harga){
        this.nomorKendaraan = nomorKendaraan;
        this.harga = harga;
    }

    public Kendaraan() {
    }
} 

class KendaraanBesar extends Kendaraan{
    KendaraanBesar(){
        super("101",100000);
    }
}

class KendaraanSedang extends Kendaraan{
    KendaraanSedang(){
        super("102",50000);
    }
}

class KendaraanKecil extends Kendaraan{
    KendaraanKecil(){
        super("103",25000);
    }
}
