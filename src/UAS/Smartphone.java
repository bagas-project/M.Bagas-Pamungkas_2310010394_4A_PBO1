
package UAS;


public class Smartphone extends Handphone {
    private String os;

    public Smartphone(String merek, int ram, int storage, String os) {
        super(merek, ram, storage);
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    // Polymorphism (method override)
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Operating System: " + os);
    }
}
