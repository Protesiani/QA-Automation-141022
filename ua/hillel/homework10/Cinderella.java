package ua.hillel.homework10;

import java.util.ArrayList;
import java.util.Random;
//added something
public class Cinderella {
    public static void main(String[] args) {
        Cinderella cinderella = new Cinderella();
        cinderella.divideList(cinderella.FillList());
    }

    ArrayList<Integer> collection = new ArrayList<>();
    ArrayList<Integer> basket1 = new ArrayList<>();
    ArrayList<Integer> basket2 = new ArrayList<>();
    ArrayList<Integer> basket3 = new ArrayList<>();

    public ArrayList<Integer> FillList() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            collection.add(random.nextInt(50));
        }
        System.out.println("All numbers " + collection);
        return collection;
    }

    public void divideList(ArrayList<Integer> list) {
        for (int number : list) {
            if (number % 2 == 0 && number % 5 == 0) {
                basket1.add(number);
                basket2.add(number);
            } else if (number % 2 == 0) {
                basket1.add(number);
            } else if (number % 5 == 0) {
                basket2.add(number);
            } else {
                basket3.add(number);
            }
        }
        System.out.println("Number in the first basket " + basket1);
        System.out.println("Number in the second basket " + basket2);
        System.out.println("Number in the in the third basket " + basket3);
    }
}

