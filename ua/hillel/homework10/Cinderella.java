package ua.hillel.homework10;

/*Змінити програму ua/hillel/homework10/Cinderella.java щоб в другий кошик попадали числа,
які діляться на 5, а не 3, і відповідно в третій - всі що не діляться ні на 2, ні на 5.*/

import java.util.ArrayList;
import java.util.Random;
//added something
public class Cinderella {
    public static <randomCount> void main(String[] args) {

        final int randomCount = 100;
        final int collectionCount = 100;

        ArrayList<Integer> collection = new ArrayList<>();
        ArrayList<Integer> basket1 = new ArrayList<>();
        ArrayList<Integer> basket2 = new ArrayList<>();
        ArrayList<Integer> basket3 = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < collectionCount; i++) {
            collection.add(random.nextInt(randomCount));
        }
        System.out.println("All numbers " + collection);
        for (int number : collection) {
            if (number % 2 == 0) {
                basket1.add(number);
            }
            if (number % 5 == 0 && number % 3 != 0) {
                basket2.add(number);
            }
            if (number % 2 != 0 && number % 5 != 0) {
                basket3.add(number);
            }
        }
        System.out.println("Number in the first basket " + basket1);
        System.out.println("Number in the second basket " + basket2);
        System.out.println("Number in the in the third basket  " + basket3);
    }

}

