package ua.hillel.lessons.homework12;

import java.util.*;

public class Task1 {
    List<Integer> list;

    HashSet<Integer> set;
    Random random = new Random();

    public Task1() {
        this.list = new ArrayList<>();
        this.set = new HashSet<>();

    }

    public void fillList() {
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(50));
        }
        System.out.println("Початкова колекция: " + list);
        HashSet set = new HashSet(list);
        System.out.println("Колекція без дублікатів: " + set);
        System.out.println("Кількість дублікатів = " + (100 - set.size()));

    }

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.fillList();
    }

}
