
public class EswterikisKausis extends Kinitiras  {
    // Πίνακας κατανάλωσης καυσίμου ανά χλμ
    private static float [] kausimoAnaXLM = {0.005f, 0.12f, 0.10f, 0.08f, 0.06f, 0.04f};
    private int kyvismos;

    public EswterikisKausis(int ippodynami, int kyvismos) {
        super(ippodynami);
        this.kyvismos=kyvismos;
    }

    @Override
    public float katanalwnei(int sxesiTaxititas, int apostasi) {
        metrisiKatanalwsis = (kausimoAnaXLM[sxesiTaxititas] * apostasi)*(getIppodynami()/100);
        return metrisiKatanalwsis;
    }

    @Override
    public String toString() {
        return super.toString() + " + With Displacement " + kyvismos;
    }

}