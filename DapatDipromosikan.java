public interface DapatDipromosikan {
    void promosikan();
    
    default void infoPromosi() {
        System.out.println("[INFO] Aset digital ini memenuhi syarat dan sedang dipromosikan.");
    }
}