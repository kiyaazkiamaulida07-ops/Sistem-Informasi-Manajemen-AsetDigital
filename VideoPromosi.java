public class VideoPromosi extends Video implements DapatDipromosikan {

    public VideoPromosi(String id, String namaFile, double ukuranMB, int durasiMenit) {
        super(id, namaFile, ukuranMB, durasiMenit);
    }

    @Override
    public void tampilkanPreview() {
        System.out.println("--- Preview Video Promosi ---");
        getInfo();
        System.out.println("Status    : Konten Promosi Aktif");
        System.out.println("-----------------------------");
    }

    @Override
    public void promosikan() {
        System.out.println("Menjalankan kampanye promosi untuk aset video: " + namaFile);
        infoPromosi();
    }
}