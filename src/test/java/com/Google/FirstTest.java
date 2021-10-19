package com.Google;
import Page.GoogleList;
import io.qameta.allure.Description;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class FirstTest {
    public static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test start");
    }

    @Test
    public void firstTest() {
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .clickLeftBracket()
                .clickOne()
                .clickPlus()
                .clickTwo()
                .clickRightBracket()
                .clickMultiply()
                .clickThree()
                .clickMinus()
                .clickFour()
                .clickZero()
                .clickDivide()
                .clickFive()
                .clickEquals();
        assertEquals("Wrong result in Test 1", googleList.getResult(), "1");
        assertEquals("Wrong memory string in Test 1", googleList.getMemoryLine(), "(1 + 2) × 3 - 40 ÷ 5 =");
    }

    @Test
    public void secondTest() {
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .clickSix()
                .clickDivide()
                .clickZero()
                .clickEquals();
        assertEquals("Wrong result in Test 2", googleList.getResult(), "Infinity");
        assertEquals("Wrong memory string in Test 2", googleList.getMemoryLine(), "6 ÷ 0 =");
    }

    @Test
    public void thridTest() {
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .clickSinus()
                .clickEquals();
        assertEquals("Wrong result in Test 3", googleList.getResult(), "Error");
        assertEquals("Wrong memory string in Test 3", googleList.getMemoryLine(), "sin() =");

    }

    @After
    public void closeTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Test finish");
    }
}
