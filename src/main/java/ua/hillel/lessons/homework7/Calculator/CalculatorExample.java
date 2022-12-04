package ua.hillel.lessons.homework7.Calculator;

public class CalculatorExample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator("Simple", "Casio", "White");
        calculator.countNumbers();

        Calculator calculator1 = new EngineeringCalculator("Engineering", "Sony 285", "Gray");
        calculator1.countNumbers();

        EngineeringCalculator engineeringCalculator = new EngineeringCalculator("Engineering", "Sony", "Gray");
        engineeringCalculator.countNumbers();
        engineeringCalculator.countNumbers(10, 2);

        AccountingCalculator accountingCalculator = new AccountingCalculator(100,10);
        accountingCalculator.CalculatePercentages();
        accountingCalculator.countNumbers(2, 10);
        accountingCalculator.countNumbers();


    }
}
