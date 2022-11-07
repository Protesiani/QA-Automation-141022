package ua.hillel.lessons.homework7.Calculator;

import java.util.Scanner;

public class EngineeringCalculator extends Calculator {


    public EngineeringCalculator(String type, String brand, String color) {
        super(type, brand, color);
    }


    public void countNumbers(double num1, double num2) {
        double res = Math.pow(num1, num2);
        System.out.println(res);
    }
}
