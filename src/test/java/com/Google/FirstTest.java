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
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .findLeftBracket()
                .findOne()
                .findPlus()
                .findTwo()
                .findRightBracket()
                .findMultiply()
                .findThree()
                .findMinus()
                .findFour()
                .findZero()
                .findDivide()
                .findFive()
                .findEquals();

    }

    @Test
    public void secondTest() {
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .findSix()
                .findDivide()
                .findZero()
                .findEquals();

    }

    @Test
    public void thridTest() {
        GoogleList googleList = new GoogleList(driver)
                .findCalc()
                .findSinus()
                .findEquals();

    }

    @After
    public void closeTest() {
        //driver.quit();

        System.out.println("test finish");
    }
}
