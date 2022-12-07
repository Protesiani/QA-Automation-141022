package ua.hillel.homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductList {
    public static void main(String[] args) {
        ProductList productList = new ProductList();
        productList.addProduct();
        productList.numbersOfProduct();
    }
    Map<String, Integer> products = new HashMap<>();

    public void addProduct() {
        int count = 5;
        for (int i = 0; i < count; i++) {
            System.out.println("Add product ");
            String product = new Scanner(System.in).next();
            System.out.println("Add count  ");
            int amount = new Scanner(System.in).nextInt();
            this.products.put(product, amount);
        }
    }
    public void numbersOfProduct() {
        int sum = 0;
        for (Map.Entry<String, Integer> entry : products.entrySet())
            sum += entry.getValue();
        System.out.println("Total number of products " + sum);
    }
}











