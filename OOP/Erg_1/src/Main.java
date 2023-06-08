public class Main {
    public static void main(String[] args) {
        // Δημιουργία δύο φοιτητών
        Foititis f1 = new Foititis("201778", 2020, "KOULOURIS DIMITRIOS");
        Foititis f2 = new Foititis("164834", 2016, "MILONA AGNI");
        Foititis f3 = new Foititis("185406", 2018,"APOSTOLSO PALIOURAS");

        // Προβολή στοιχείων φοιτητών
        System.out.println("\n--- Users details ---");
        System.out.println(f1.dwseAM() + "\t" + f1.getEtosEisagwgis() + " " +
                f1.getOnomatEpwnymo());
        System.out.println(f2.dwseAM() + "\t" +  f2.getEtosEisagwgis() +" "+ f2.getOnomatEpwnymo());
        System.out.println(f3.dwseAM() + "\t"+ f3.getEtosEisagwgis() + " " + f3.getOnomatEpwnymo());

    }
    }
