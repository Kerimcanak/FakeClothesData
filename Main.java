import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ClothingItem {
    String name;
    double price;
    String size;

    public ClothingItem(String name, double price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}

public class Main {
    private static final String[] NAMES = {"T-Shirt", "Jeans", "Jacket", "Sweater", "Dress", "Skirt"};
    private static final String[] SIZES = {"S", "M", "L", "XL"};
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<ClothingItem> items = generateFakeData(10);
        for (ClothingItem item : items) {
            System.out.println(item);
        }
    }

    private static List<ClothingItem> generateFakeData(int count) {
        List<ClothingItem> items = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            double price = 10 + (100 - 10) * RANDOM.nextDouble();
            String size = SIZES[RANDOM.nextInt(SIZES.length)];
            items.add(new ClothingItem(name, price, size));
        }
        return items;
    }
}
