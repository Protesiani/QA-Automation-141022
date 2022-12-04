package ua.hillel.lessons.homework12;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Пальто", 10);
        map.put("Брюки", 20);
        map.put("Шарф", 30);
        int sum = 0;
        for (Integer s : map.values()) {
            sum += s;
        }
        System.out.println("Загальна кількість товару: " + sum);
    }
}
