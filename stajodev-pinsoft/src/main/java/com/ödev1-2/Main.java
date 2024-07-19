public class Main {
    public static void main(String[] args) {

        Item item1 = new Item("Laptop", "TechSupplier", 5000.0, 4000.0);
        Item item2 = new Item("Mouse", "GadgetStore", 150.0, 100.0);
        Item item3 = new Item("Keyboard", "GadgetStore", 300.0, 200.0);

        ShoppingCart cart = new ShoppingCart();

        cart.urunEkle(item1);
        cart.urunEkle(item2);
        cart.urunEkle(item3);

        for (Item item : cart.getItems()) {
            System.out.println(item.getUrunAdi() + " - Satış Fiyatı: " + item.getSatisFiyati());
        }
        double total = cart.totalFiyat();
        System.out.println("Toplam Fiyat: " + total);
    }
}
