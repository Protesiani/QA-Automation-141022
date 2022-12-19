package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class ClickButton {
    @Test
    public void clickButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom ");

        driver.findElement(By.xpath("//a[@class = 'button']")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'alert')]")).click();
        driver.findElement(By.xpath("//a[contains(@class, 'success')]")).click();
        List<WebElement> text = driver.findElements(By.xpath("//tbody//td[4]"));
        text.forEach(c -> System.out.println(c.getText()));
        driver.quit();


    }
}
