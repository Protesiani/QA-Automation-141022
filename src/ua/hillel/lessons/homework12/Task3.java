package ua.hillel.lessons.homework12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task3 {
    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();

    Random random = new Random();


    public void fillList() {
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
            int s = list.get(i);
            if (s % 2 == 0) {
                list1.add(s);
            }
            if (s % 3 == 0) {
                list2.add(s);
            }
            if (s % 2 != 0 && i % 3 != 0) {
                list3.add(s);
            }
        }

        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }


    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.fillList();

    }
}
