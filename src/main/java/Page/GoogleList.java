package Page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleList {

    public WebDriver driver;

    public GoogleList(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get("https://www.google.com/");
    }

    @FindBy(xpath = "//input[@name='q']")
    private WebElement googleInput;
    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    private WebElement zeroButton;
    @FindBy(xpath = "//div[@jsname='N10B9']")
    private WebElement oneButton;
    @FindBy(xpath = "//div[@jsname='lVjWed']")
    private WebElement twoButton;
    @FindBy(xpath = "//div[@jsname='KN1kY']")
    private WebElement threeButton;
    @FindBy(xpath = "//div[@jsname='xAP7E']")
    private WebElement fourButton;
    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    private WebElement fiveButton;
    @FindBy(xpath = "//div[@jsname='abcgof']")
    private WebElement sixButton;
    @FindBy(xpath = "//div[@jsname='rk7bOd']")
    private WebElement sevenButton;
    @FindBy(xpath = "//div[@jsname='T7PMFe']")
    private WebElement eightButton;
    @FindBy(xpath = "//div[@jsname='XoxYJ']")
    private WebElement nineButton;
    @FindBy(xpath = "//div[@jsname='j93WEe']")
    private WebElement leftBracketButton;
    @FindBy(xpath = "//div[@jsname='qCp9A']")
    private WebElement rightBracketButton;
    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    private WebElement plusButton;
    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    private WebElement minusButton;
    @FindBy(xpath = "//div[@jsname='YovRWb']")
    private WebElement multiplyButton;
    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    private WebElement divideButton;
    @FindBy(xpath = "//div[@jsname='aN1RFf']")
    private WebElement sinusButton;
    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    private WebElement equalsButton;

    @FindBy(xpath = "//span[@jsname='VssY5c']")
    private WebElement resultText;
    @FindBy(xpath = "//span[@jsname='ubtiRe']")
    private WebElement memoryLineText;

    public GoogleList findCalc() {
        googleInput.sendKeys("??????????????????????", Keys.ENTER);
        return this;
    }

    public GoogleList clickZero() {
        zeroButton.click();
        return this;
    }

    public GoogleList clickOne() {
        oneButton.click();
        return this;
    }

    public GoogleList clickTwo() {
        twoButton.click();
        return this;
    }

    public GoogleList clickThree() {
        threeButton.click();
        return this;
    }

    public GoogleList clickFour() {
        fourButton.click();
        return this;
    }

    public GoogleList clickFive() {
        fiveButton.click();
        return this;
    }

    public GoogleList clickSix() {
        sixButton.click();
        return this;
    }

    public GoogleList clickSeven() {
        sevenButton.click();
        return this;
    }

    public GoogleList clickEight() {
        eightButton.click();
        return this;
    }

    public GoogleList clickNine() {
        nineButton.click();
        return this;
    }

    public GoogleList clickLeftBracket() {
        leftBracketButton.click();
        return this;
    }

    public GoogleList clickRightBracket() {
        rightBracketButton.click();
        return this;
    }

    public GoogleList clickPlus() {
        plusButton.click();
        return this;
    }

    public GoogleList clickMinus() {
        minusButton.click();
        return this;
    }

    public GoogleList clickMultiply() {
        multiplyButton.click();
        return this;
    }

    public GoogleList clickDivide() {
        divideButton.click();
        return this;
    }

    public GoogleList clickEquals() {
        equalsButton.click();
        return this;
    }

    public GoogleList clickSinus() {
        sinusButton.click();
        return this;
    }


    public String getResult() {
        return resultText.getText();
    }

    public String getMemoryLine() {
        return memoryLineText.getText();
    }

}
