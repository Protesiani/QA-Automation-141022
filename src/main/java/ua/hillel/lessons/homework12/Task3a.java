package ua.hillel.lessons.homework12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task3a {
    List<Integer> list = new ArrayList<>();
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    List<Integer> list3 = new ArrayList<>();

    Random random = new Random();


    public void fillList() {
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
    }

    public void fillList1() {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 == 0) {
                list1.add(i);
            }
            if (i % 3 == 0) {
                list2.add(i);
            }
            if (i % 2 != 0 && i % 3 != 0) {
                list3.add(i);
            }
        }
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }


    public static void main(String[] args) {
        Task3a task3a = new Task3a();
        task3a.fillList();
        task3a.fillList1();
    }
}

