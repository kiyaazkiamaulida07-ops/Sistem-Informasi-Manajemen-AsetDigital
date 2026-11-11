public class Dokumen extends AsetDigital {
    private int jumlahHalaman;

    public Dokumen(String id, String namaFile, double ukuranMB, int jumlahHalaman) {
        super(id, namaFile, ukuranMB);
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("--- Preview Dokumen ---");
        getInfo();
        System.out.println("Halaman   : " + jumlahHalaman + " halaman");
        System.out.println("-----------------------");
    }
}