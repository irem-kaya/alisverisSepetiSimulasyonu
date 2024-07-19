import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void urunEkle(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
    public double totalFiyat() {
        double toplamFiyat = 0.0;
        for (Item item : items) {
            toplamFiyat += item.getSatisFiyati();
        }
        return toplamFiyat;
    }
}
