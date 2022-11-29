package ua.hillel.lessons.homework12.shopping_list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Shopping_list {
    public static void main(String[] args) {
        Shopping_list shopping_list = new Shopping_list();
        shopping_list.countType();
        shopping_list.countAll();
    }


    List<Product> products;

    public Shopping_list() {
        this.products = new ArrayList<>();
        products.add(new Product("футболка", 20));
        products.add(new Product("брюки", 30));
        products.add(new Product("шарф", 20));

    }

    public void countType() {
        System.out.println("Всього видів товару:  " + products.size());
    }

    public void countAll() {
        double sum =0;
        for (Product s : products) {
            sum += s.getCount();
        }
        System.out.println("Загальна кількість товарів: " + sum);
    }


}

