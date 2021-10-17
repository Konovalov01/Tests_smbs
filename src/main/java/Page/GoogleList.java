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

    public GoogleList findOne() {
        WebElement inputField = driver.findElement(By.xpath("//div[@jsname='N10B9']"));
        inputField.click();
        return this;
    }

}
