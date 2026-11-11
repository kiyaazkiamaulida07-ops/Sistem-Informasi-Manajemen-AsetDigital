import java.util.ArrayList;

public class MainAset {
    public static void main(String[] args) {
        // 1. Membuat ArrayList<AsetDigital> berisi minimal 1 objek dari masing-masing subclass
        ArrayList<AsetDigital> daftarAset = new ArrayList<>();
        daftarAset.add(new Gambar("IMG-001", "pemandangan.jpg", 3.5, "1920x1080"));
        daftarAset.add(new Video("VID-001", "tutorial_java.mp4", 150.0, 15));
        daftarAset.add(new Dokumen("DOC-001", "laporan_praktikum.pdf", 2.1, 25));
        daftarAset.add(new VideoPromosi("PROMO-001", "iklan_produk.mp4", 45.0, 1));

        System.out.println("=== DEMO POLIMORFISME VIA ABSTRACT CLASS (tampilkanPreview) ===");
        // 2. Iterasi dan panggil tampilkanPreview() — polimorfisme via abstract class
        for (AsetDigital aset : daftarAset) {
            aset.tampilkanPreview();
            System.out.println();
        }

        System.out.println("=== DEMO PENGECEKAN INTERFACE DENGAN INSTANCEOF ===");
        // 3. Gunakan instanceof untuk mengecek objek yang mengimplementasikan DapatDipromosikan
        for (AsetDigital aset : daftarAset) {
            if (aset instanceof DapatDipromosikan) {
                System.out.println("Ditemukan aset yang dapat dipromosikan (ID: " + aset.id + "):");
                DapatDipromosikan promoItem = (DapatDipromosikan) aset;
                promoItem.promosikan();
                System.out.println();
            }
        }

        System.out.println("=== DEMO POLIMORFISME VIA INTERFACE (ArrayList Terpisah) ===");
        // 4. Buat ArrayList<DapatDipromosikan> terpisah dan tambahkan VideoPromosi ke dalamnya
        ArrayList<DapatDipromosikan> daftarPromo = new ArrayList<>();
        
        for (AsetDigital aset : daftarAset) {
            if (aset instanceof DapatDipromosikan) {
                daftarPromo.add((DapatDipromosikan) aset);
            }
        }

        // Iterasi ArrayList interface
        for (DapatDipromosikan dp : daftarPromo) {
            dp.promosikan();
            dp.infoPromosi();
            System.out.println("---");
        }
    }
}