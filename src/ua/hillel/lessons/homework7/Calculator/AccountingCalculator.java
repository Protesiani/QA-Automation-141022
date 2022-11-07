package ua.hillel.lessons.homework7.Calculator;

public class AccountingCalculator extends EngineeringCalculator {
    private double num;
    private double percent;

    public AccountingCalculator(String type, String brand, String color) {
        super(type, brand, color);

    }

    public AccountingCalculator(double num, double percent) {
        super("Accounting", "Citizen", "Blake");
        this.num = num;
        this.percent = percent;
    }

    @Override
    public void countNumbers() {
        super.countNumbers();
    }

    @Override
    public void countNumbers(double num1, double num2) {
        super.countNumbers(num1, num2);
    }

    public void CalculatePercentages() {
        double res = num * percent / 100;
        System.out.println(res);
    }
}
