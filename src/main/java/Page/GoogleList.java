package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class GoogleList extends BasePage{

    public GoogleList(ChromeDriver driver){
        this.driver = driver;
        driver.get("https://www.google.com/");
    }

//    @FindBy (xpath = "//input[@name='q']")
//    private WebElement inputField = driver.findElement(By.xpath("//input[@name='q']"));

    public GoogleList findCalc() {
        WebElement inputField = driver.findElement(By.xpath("//input[@name='q']"));
        inputField.sendKeys("Калькулятор", Keys.ENTER);
        return this;
    }

    public GoogleList findZero() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));
        inputField.click();
        return this;
    }

    public GoogleList findOne() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='N10B9']"));
        inputField.click();
        return this;
    }

    public GoogleList findTwo() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='lVjWed']"));
        inputField.click();
        return this;
    }

    public GoogleList findThree() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='KN1kY']"));
        inputField.click();
        return this;
    }

    public GoogleList findFour() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='xAP7E']"));
        inputField.click();
        return this;
    }

    public GoogleList findFive() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='Ax5wH']"));
        inputField.click();
        return this;
    }

    public GoogleList findSix() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='abcgof']"));
        inputField.click();
        return this;
    }

    public GoogleList findSeven() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='rk7bOd']"));
        inputField.click();
        return this;
    }

    public GoogleList findEight() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='T7PMFe']"));
        inputField.click();
        return this;
    }

    public GoogleList findNine() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='XoxYJ']"));
        inputField.click();
        return this;
    }

    public GoogleList findLeftBracket() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='j93WEe']"));
        inputField.click();
        return this;
    }

    public GoogleList findRightBracket() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='qCp9A']"));
        inputField.click();
        return this;
    }

    public GoogleList findPlus() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='XSr6wc']"));
        inputField.click();
        return this;
    }

    public GoogleList findMinus() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='pPHzQc']"));
        inputField.click();
        return this;
    }

    public GoogleList findMultiply() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='YovRWb']"));
        inputField.click();
        return this;
    }

    public GoogleList findDivide() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='WxTTNd']"));
        inputField.click();
        return this;
    }

    public GoogleList findEquals() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
        inputField.click();
        return this;
    }

    public GoogleList findSinus() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='aN1RFf']"));
        inputField.click();
        return this;
    }

}
