
public class Epivatiko extends Oxima {
    
    private int thyres;
        
    public Epivatiko (String arKykloforias, int thyres, Kinitiras kinitiras) { 
        super(arKykloforias, kinitiras);
        this.thyres = thyres;
    }
    
    public int getThyres() {
        return thyres;
    }
    
    public String toString() {       
        return (super.toString() + "   είναι " + thyres + " Θυρo");
    }
    
}
