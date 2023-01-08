package ua.hillel.homework10;


import java.util.ArrayList;
import java.util.Random;
//added something
public class Cinderella {
    public static void main(String[] args) {

        ArrayList<Integer> collection = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            collection.add(random.nextInt(50));
        }

        System.out.println("All numbers " + collection);
        System.out.println("Number in the first basket " + collection.stream().filter(i -> i % 2 == 0).toList());
        System.out.println("Number in the second basket " + collection.stream().filter(i -> i % 5 == 0).toList());
        System.out.println("Number in the third basket " + collection.stream().filter(i -> i % 2 != 0 && i % 5 != 0).toList());

    }
}