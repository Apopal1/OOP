public class Foititis {
    // Δήλωση πεδίων
    private String AM;
    private String onomatEpwnymo;
    private int etosEisagwgis;

    // Δήλωση δημιουργών
    public Foititis(String AM) {
        this.AM = AM;
    }

    public Foititis(String AM, int etosEisagwgis, String onomatEpwnymo) {
        this.AM = AM;
        this.onomatEpwnymo = onomatEpwnymo;
        this.etosEisagwgis = etosEisagwgis;
    }

    // Δήλωση μεθόδων
    public String dwseAM() {
        return this.AM;
    }

    public String getOnomatEpwnymo() {
        return onomatEpwnymo;
    }

    public int getEtosEisagwgis() {
        return etosEisagwgis;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }

    public void setEtosEisagwgis(int etosEisagwgis) {
        this.etosEisagwgis = etosEisagwgis;
    }

    @Override
    public String toString() {
        return "Foititis{" + "AM=" + AM + ", onomatEpwnymo="
                + onomatEpwnymo + ", etosEisagwgis=" + etosEisagwgis + '}';
    }
}
