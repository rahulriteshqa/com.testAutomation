package com.testAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * TestPractice
 */
public class TestPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://ui.freecrm.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.name("email")).sendKeys("rahul");
        driver.findElement(By.name("password")).sendKeys("rahul@123");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();



    }
}
