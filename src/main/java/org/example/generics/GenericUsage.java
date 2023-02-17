package org.example.generics;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenericUsage {

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>(1);
        Box<Integer> box2 = new Box<>(163);
        Box<Double> box3 = new Box<>(1.63d);
        Box<Integer> box4 = new Box<>(2000);
        Box<Integer> box5 = new Box<>(17);
        Box<Integer> box6 = new Box<>(23);
        Box<Double> box7 = new Box<>(331d);
        Box<String> box8 = new Box<>("Hello Generics"); //won't work due to T extends Numbers. String not number



        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box4);
        System.out.println(box5);
        System.out.println(box6);
        System.out.println(box7);
        System.out.println(box8);

        Crate<Box<?>> crate = new Crate<>();
        crate.addBox(box1);
        crate.addBox(box2);
        crate.addBox(box3);
        crate.addBox(box4);
        crate.addBox(box5);
        crate.addBox(box6);
        crate.addBox(box7);
        crate.addBox(box8);

        System.out.println(crate);

        List<Integer> numbers = new Random()
                .ints(1, 500)
                .limit(100)
                .boxed()
                .collect(Collectors.toList());
    }
}
