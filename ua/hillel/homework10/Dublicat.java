package ua.hillel.homework10;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Dublicat {
    public static void main(String[] args) {
        ArrayList<Integer> inputList = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            inputList.add(random.nextInt(50));
        }
        System.out.println("Collection " + inputList);

        Set<Integer> set = new LinkedHashSet<Integer>(inputList);
        int count = inputList.size() - set.size();
        System.out.println("Collection no dublicat " + set);
        System.out.println("Number of deleted duplicates " + count);

    }


}
