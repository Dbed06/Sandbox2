package org.example.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        Apple apple1 = new Apple(Size.LARGE, Color.GREEN, "Granny Smity");
        Apple apple2 = new Apple(Size.MEDIUM, Color.RED, "Fuji");
        Apple apple3 = new Apple(Size.LARGE, Color.RED, "Gala");
        Apple apple4 = new Apple(Size.MEDIUM, Color.YELLOW, "Golden Delicious");
        Apple apple5 = new Apple(Size.SMALL, Color.RED, "McIntosh");
        Apple apple6 = new Apple(Size.XLARGE, Color.GREEN, "McIntosh");
        Apple apple7 = new Apple(Size.SMALL, Color.GREEN, "McIntosh");


        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);
        apples.add(apple6);
        apples.add(apple7);


        apples.forEach(System.out::println);
        Collections.sort(apples);
        apples.forEach(System.out::println);


    }
}
