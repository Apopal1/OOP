// Η κλάση αυτή χρησιμοποιείται για εμφάνιση μηνύματος 
public class Mynima {
    
    private static String mynimaStr;
    
    public static void setMynima(String mynima) {
        mynimaStr = mynima;
    }
    
    public static void show() {
        System.out.println(mynimaStr);
        mynimaStr = "";
    }
    public static void show(String mynima) {
        System.out.println(mynima);
    }
}
