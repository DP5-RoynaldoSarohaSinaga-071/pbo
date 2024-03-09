class Pemesanan{
    private String alamat, nomorTelepon, namaPelanggan;
    private int jumlahPenumpang, idPemesanan;
    private long durasi;
    private Kendaraan kendaraan;
    
    Pemesanan(){
    }
    
    void setDurasi(long durasi){
        this.durasi = durasi;
    }
    
    void setData(String namaPelanggan, String alamat, String nomorTelepon, Kendaraan kendaraan, int jumlahPenumpang, int idPemesanan){
        this.kendaraan = kendaraan;
        this.namaPelanggan = namaPelanggan;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.jumlahPenumpang = jumlahPenumpang;
        this.idPemesanan = idPemesanan;
    }

    void setJumlahPenumpang(int jumlahPenumpang) {
        this.jumlahPenumpang = jumlahPenumpang;
    }

    private int hitungTotalHarga(long durasi, int harga){
        return (int) durasi * harga;
    }

    Boolean validasiTanggal(long durasi){
        if (durasi <= 0){
            return false;
        }
        else {
            return true;
        }
    }

    void display(){
        System.out.println("===========================================");
        System.out.printf(" %-18s : %s%n", "ID Pemesanan", idPemesanan);
        System.out.printf(" %-18s : %s%n", "Nama", namaPelanggan);
        System.out.printf(" %-18s : %s%n", "Alamat", alamat);
        System.out.printf(" %-18s : %s%n", "Nomor telepon", nomorTelepon);
        System.out.printf(" %-18s : %s%n", "Nomor Kendaraan", kendaraan.nomorKendaraan);
        System.out.printf(" %-18s : %d orang%n", "Jumlah penumpang", jumlahPenumpang);
        System.out.printf(" %-18s : %d hari%n", "Durasi sewa", durasi);
        System.out.printf(" %-18s : Rp. %d%n", "Harga total", hitungTotalHarga(durasi, kendaraan.harga));
        System.out.println("===========================================");
    }
}