public class Gambar extends AsetDigital {
    private String resolusi;

    public Gambar(String id, String namaFile, double ukuranMB, String resolusi) {
        super(id, namaFile, ukuranMB);
        this.resolusi = resolusi;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("--- Preview Gambar ---");
        getInfo();
        System.out.println("Resolusi  : " + resolusi);
        System.out.println("----------------------");
    }
}