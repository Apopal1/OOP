import java.util.Random;
import java.lang.*;
import java.text.*;

public abstract class Oxima {
    private String arKykloforias;    
    private int sxesiTaxititas;
    private Kinitiras kinitiras;  // Σύνδεση με έναν Κινητήρα
    private int varos;
    
    public Oxima (String arKykloforias, Kinitiras kinitiras) {
        this.arKykloforias = arKykloforias;        
        this.kinitiras = kinitiras;
    }
    public void vazeiMpros() {
        sxesiTaxititas=0;
        Mynima.show("\nPlate number " + arKykloforias +
                " Starts, its an " + this.getClass().getName());
        kinitiras.seLeitourgia();
    }
    // 2.γ
    public void seKinisi(int apostasiDiadromis) {
        Mynima.show("\nThe car with plate number " + arKykloforias +
                " is moving in a 1000 km direction \n");
        DecimalFormat df = new DecimalFormat("#.##");
        float katanalwsi = 0f;        
        int ypoloipoDiadromis = apostasiDiadromis;
        int apostasi=0;               
        while (ypoloipoDiadromis > 0) {          
            allagiTaxititas();
            apostasi = (sxesiTaxititas * sxesiTaxititas)*10;            
            if (ypoloipoDiadromis < apostasi) {
                apostasi = ypoloipoDiadromis;
            }
            ypoloipoDiadromis -= apostasi;       
            katanalwsi = kinitiras.katanalwnei(sxesiTaxititas, apostasi);
            
           
        }               
    }
    
    private void allagiTaxititas() {
        Random rand = new Random();
        int rVal = 0;     // Obtain a number between [0 - 1]   
        rVal = rand.nextInt(99);
        if (rVal < 25) {         // 25% μικρές σχέσεις ταχύτητας 
            sxesiTaxititas--;
            if (sxesiTaxititas<1)   
                sxesiTaxititas+=2; 
        } 
        else {
            sxesiTaxititas++; 
            if (sxesiTaxititas>5)   
                sxesiTaxititas-=2;                           
        }   
    }    

    public String getArKykloforias() {
        return arKykloforias;
    }

    public int getVaros() {
        return varos;
    }
    
    public String toString() {
        return (arKykloforias + " with engine: "
                + "\n\t" + kinitiras);
    }
}
