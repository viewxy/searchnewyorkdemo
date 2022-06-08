import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton {
    WebDriver driver;

    public RadioButton(WebDriver driver) {
        this.driver = driver;
    }

    private final String url = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By button = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]");
    private final By checkValueButton = By.xpath("//*[@id=\"buttoncheck\"]");
    private final By text = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]");

    public void navigate() {
        driver.navigate().to(url);
    }

    public void clickBox() {
        driver.findElement(button).click();
    }

    public void clickCheckValueButton() {
        driver.findElement(checkValueButton).click();
    }

    public String getText() {
        return driver.findElement(text).getText();
    }
}
