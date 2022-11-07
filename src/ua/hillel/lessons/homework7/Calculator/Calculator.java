package ua.hillel.lessons.homework7.Calculator;

import java.util.Scanner;

public class Calculator {

    private String type;
    private String brand;
    private String color;


    public Calculator(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    public void countNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 number:  ");
        var num1 = scanner.nextDouble();

        System.out.println("Enter 2 number");
        var num2 = scanner.nextDouble();

        double res;

        System.out.println("Action");
        var action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result  " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result  " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result  " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Result  " + res);
                }
                break;
            default:
                System.out.println("You do not enter...");

        }
    }


}
