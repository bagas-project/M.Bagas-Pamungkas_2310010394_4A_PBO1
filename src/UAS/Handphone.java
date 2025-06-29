
package UAS;


public class Handphone {
    private final String merek;
    private int ram; // in GB
    private int storage; // in GB

    public Handphone(String merek, int ram, int storage) {
        this.merek = merek;
        this.ram = ram;
        this.storage = storage;
    }

    // Accessor (getter)
    public String getMerek() {
        return merek;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    // Mutator (setter)
    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
    }
}

