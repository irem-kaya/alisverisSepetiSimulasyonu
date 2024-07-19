public class geometrikSekil {
    private String renk;

    public geometrikSekil(String renk) {
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double alanHesaplama() {
        
        return 0;
    }

    public double cevreHesaplama() {
        return 0;
    }

    @Override
    public String toString() {
        return "Geometrik Sekil [renk=" + renk + "]";
    }
}
