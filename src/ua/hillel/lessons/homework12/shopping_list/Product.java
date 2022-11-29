package ua.hillel.lessons.homework12.shopping_list;

public class Product {
    private String name;
    private double count;

    public Product(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public double getCount() {
        return count;
    }

}
