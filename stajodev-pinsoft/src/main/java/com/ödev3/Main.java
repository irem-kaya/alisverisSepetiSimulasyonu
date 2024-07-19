public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(5.0, 3.0, "Mavi");
        
        System.out.println("Alan: " + dikdortgen.alanHesaplama());
        System.out.println("Çevre: " + dikdortgen.cevreHesaplama());
        System.out.println(dikdortgen.toString());
    }
}
