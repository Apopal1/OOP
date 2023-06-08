
import java.util.Scanner;

public class MAIN {

    private static Oxima [] pinOximata;
    
    public static void main(String[] args) {
           
        // Δημιουργία οχημάτων
        pinOximata = new Oxima[2];       
        pinOximata[0] = new Epivatiko("CAC1755", 3, new EswterikisKausis(110, 1600));        

        
        // Πολυμορφισμός – Τελεστής instanceof - downcasting
        for (int i=0; i<pinOximata.length; i++) {
            
        }
        
        // Λειτουργία και κίνηση ενός οχήματος
        System.out.print("\n\n\nGive a position of the array: ");
        Scanner sc = new Scanner(System.in);
        int thesiPin = sc.nextInt();
        
        pinOximata[thesiPin].vazeiMpros();         
        
        pinOximata[thesiPin].seKinisi(1000);   // χλμ
        
        System.exit(0);
        
    }
    
}
