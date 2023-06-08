
public abstract class Kinitiras {
    private int ippodynami;
    protected float metrisiKatanalwsis;  // σε €

    public Kinitiras (int ippodynami) {
        this.ippodynami = ippodynami;
        this.metrisiKatanalwsis = 0;
    }
    public void seLeitourgia() {
        Mynima.show("\t with engine <" + this.getClass().getName() +
                " is on»");
    }
    // abstract
    public abstract float katanalwnei(int sxesiTaxititas, int apostasi);

    public String getKlasi() {
        return (this.getClass().getName());
    }

    public String toString() {
        String className = this.getClass().getName();
        return (className + " with Hp: " + ippodynami);
    }

    public int getIppodynami() {
        return ippodynami;
    }

}
