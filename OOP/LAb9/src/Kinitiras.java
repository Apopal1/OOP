
public abstract class Kinitiras {    
    private int ippodynami;
    protected float metrisiKatanalwsis;  // σε €
    
    public Kinitiras (int ippodynami) {
        this.ippodynami = ippodynami;
        this.metrisiKatanalwsis = 0;
    }
    public void seLeitourgia() {
        Mynima.show("\t With engine <" + this.getClass().getName() +
                " is started»");
    }
    // abstract
    public abstract float katanalwnei(int sxesiTaxititas, int apostasi);
  
    public String getKlasi() {        
        return (this.getClass().getName());
    }
    
    public String toString() {
        String className = this.getClass().getName();
        return (className + " Hp: " + ippodynami);
    }

    public int getIppodynami() {
        return ippodynami;
    }
    
}
