package MyProject5.Flowers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Flow {
    public static void main(String[] args) {

//        Задание 3

        Roses rose1 = new Roses(50.5);
        Roses rose2 = new Roses(53.5);
        Roses rose3 = new Roses(59.5);
        Violet violet1 = new Violet(45.30);
        Violet violet2 = new Violet(49.30);
        Violet violet3 = new Violet(45.80);
        Carnations carnation1 = new Carnations(25.90);
        Carnations carnation2 = new Carnations(35.90);
        Carnations carnation3 = new Carnations(39.90);
        Tulips tulip1 = new Tulips(39.90);
        Tulips tulip2 = new Tulips(38);
        Tulips tulip3 = new Tulips(37);
        Daisies daisy1 = new Daisies(60.80);
        Daisies daisy2 = new Daisies(65);
        Daisies daisy3 = new Daisies(63.8);
    Bouquet bouquet1 = new Bouquet();
    bouquet1.addFlower(rose1).addFlower(violet1).addFlower(carnation1).addFlower(tulip1).addFlower(daisy1);
        System.out.println("Стоимость букета1: " + bouquet1.getPrice());
        Bouquet bouquet2 = new Bouquet();
        bouquet2.addFlower(rose2).addFlower(violet2).addFlower(carnation2).addFlower(tulip2).addFlower(daisy2);
        System.out.println("Стоимость букета2: " + bouquet2.getPrice());
        Bouquet bouquet3 = new Bouquet();
        bouquet3.addFlower(rose3).addFlower(violet3).addFlower(carnation3).addFlower(tulip3).addFlower(daisy3);
        System.out.println("Стоимость букета3: " + bouquet3.getPrice());



//        Задание 4



        Tulips tulips4 = new Tulips(44);
        tulips4.sell();
        Daisies daisy4 = new Daisies(60.80);
        daisy4.sell();
        Carnations carnation4 = new Carnations(35.90);
        carnation4.sell();
        Violet violet4 = new Violet(45.30);
        violet4.sell();
        Roses rose4 = new Roses(50.5);
        rose4.sell();
        Bouquet bouquet4 = new Bouquet();
        bouquet4.addFlower(rose3).addFlower(violet3).addFlower(carnation3).addFlower(tulip3).addFlower(daisy3);
        bouquet4.sell();
        System.out.println("Цветов: " + Flowers.getCounter() + "; продано: " + Flowers.getSoldCount());

//



  }



        }




