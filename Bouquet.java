package MyProject5.Flowers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bouquet {
    private int price;
    private List<Flowers> flowers = new ArrayList<Flowers>();


    public Bouquet addFlower(Flowers flower) {
        flowers.add(flower);
        price += flower.getPrice();
        return this;


    }

    public double getPrice() {
        return price;

    }


    public void sell() {
        for (Flowers f : flowers) {
            f.sell();
        }


        }

    }
