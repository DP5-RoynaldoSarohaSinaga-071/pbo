import java.time.LocalDate;
class Pelanggan {
    private String nama, alamat, nomorTelepon;
    int jumlahPenumpang;
    private LocalDate tanggalAwal, tanggalAkhir;
    Pemesanan pemesanan;

    Pelanggan(){
    }

    String getNama() {
        return nama;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    String getAlamat() {
        return alamat;
    }

    void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    String getNomorTelepon() {
        return nomorTelepon;
    }

    void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    LocalDate getTanggalAwal() {
        return tanggalAwal;
    }

    void setTanggalAwal(LocalDate tanggal) {
        this.tanggalAwal = tanggal;
    }

    LocalDate getTanggalAkhir() {
        return tanggalAkhir;
    }

    void setTanggalAkhir(LocalDate tanggal) {
        this.tanggalAkhir = tanggal;
    }
}
