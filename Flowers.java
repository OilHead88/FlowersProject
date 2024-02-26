package MyProject5.Flowers;

import java.util.ArrayList;
import java.util.List;

public class Flowers extends Bouquet {
    String countryOfOrigin;
    int shelfLifeInDays;
    private double price;
    private static int counter = 0;
    private static int soldCount = 0;
    private boolean sold = false;

    public void sell() {
        this.sold = true;
        Flowers.soldCount++;
    }
    public Flowers(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.price = price;
        Flowers.counter++;

    }
    public static int getSoldCount() {
        return Flowers.soldCount;
    }


    public double getPrice() {
        return price;
    }

    public static int getCounter() {
        return Flowers.counter;
    }
}


////


