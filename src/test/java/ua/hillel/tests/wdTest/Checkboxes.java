package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {
    @Test
    public void checkboxes() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        System.out.println("Checkbox1 state: " + driver.findElement(By.xpath("//input[1]")).isSelected());
        System.out.println("Checkbox2 state: " + driver.findElement(By.xpath("//input[2]")).isSelected());
        if (!driver.findElement(By.xpath("//input[1]")).isSelected()) {
            driver.findElement(By.xpath("//input[1]")).click();
        }
        if (!driver.findElement(By.xpath("//input[2]")).isSelected()) {
            driver.findElement(By.xpath("//input[2]")).click();
        }

        System.out.println("Checkbox1 state: " + driver.findElement(By.xpath("//input[1]")).isSelected());
        System.out.println("Checkbox2 state: " + driver.findElement(By.xpath("//input[2]")).isSelected());
        driver.quit();
    }
}
