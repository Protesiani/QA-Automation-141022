package ua.hillel.tests.wdTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login {

    @Test
    public void login() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class='radius']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='flash']")).getText(), "You logged into a secure area!\n×");
        System.out.println(driver.findElement(By.xpath("//div[@id='flash']")).getText());
        driver.quit();

    }

    @Test
    public void loginError() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//label[text()='Username']/../input")).sendKeys("tom");
        driver.findElement(By.xpath("//label[text()='Password']/../input")).sendKeys("Super");
        driver.findElement(By.xpath("//button[@class='radius']")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='flash']")).getText(), "Your username is invalid!\n×");
        System.out.println(driver.findElement(By.xpath("//div[@id='flash']")).getText());
        driver.quit();
    }
}
