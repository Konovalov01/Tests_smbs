package com.Google;

import Page.GoogleList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public  ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();

        System.out.println("test start");
    }

    @Test
    public void firstTest() {


//        driver.get("https://www.google.com/");

        GoogleList googleList = new GoogleList(driver).findCalc();



//        WebElement element = driver.findElement(By.xpath("//input[@name='q']"));

//        element.sendKeys("Калькулятор", Keys.ENTER);

//        element = driver.findElement(By.xpath("//div[@jsname='zLiRgc']"));
//
//        element.sendKeys("1");

    }

    @After
    public void closeTest() {
        //driver.quit();

        System.out.println("test finish");
    }
}
