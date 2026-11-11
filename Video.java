public class Video extends AsetDigital {
    private int durasiMenit;

    public Video(String id, String namaFile, double ukuranMB, int durasiMenit) {
        super(id, namaFile, ukuranMB);
        this.durasiMenit = durasiMenit;
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("--- Preview Video ---");
        getInfo();
        System.out.println("Durasi    : " + durasiMenit + " menit");
        System.out.println("---------------------");
    }
}