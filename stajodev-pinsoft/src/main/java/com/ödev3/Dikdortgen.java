public class Dikdortgen extends geometrikSekil {
    private double uzunluk;
    private double genislik;

    public Dikdortgen(double uzunluk, double genislik, String renk) {
        super(renk);
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesaplama() {
        return uzunluk * genislik;
    }

    @Override
    public double cevreHesaplama() {
        return 2 * (uzunluk + genislik);
    }

    @Override
    public String toString() {
        return "Dikdörtgen [uzunluk=" + uzunluk + ", genislik=" + genislik + ", renk=" + getRenk() + "]";
    }

}
