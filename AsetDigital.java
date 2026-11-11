public abstract class AsetDigital {
    protected String id;
    protected String namaFile;
    protected double ukuranMB;

    public AsetDigital(String id, String namaFile, double ukuranMB) {
        this.id = id;
        this.namaFile = namaFile;
        this.ukuranMB = ukuranMB;
    }

    // Method abstrak yang wajib di-override oleh subclass
    public abstract void tampilkanPreview();

    // Method konkrit untuk mencetak info dasar
    public void getInfo() {
        System.out.println("ID        : " + id);
        System.out.println("Nama File : " + namaFile);
        System.out.println("Ukuran    : " + ukuranMB + " MB");
    }
}