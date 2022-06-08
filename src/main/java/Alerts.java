import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alerts {
    WebDriver driver;

    public Alerts(WebDriver driver) {
        this.driver = driver;
    }

    private final String url = "http://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By clickMeButton = By.xpath("//*[@onclick=\"myConfirmFunction()\"]");
    private final By text = By.xpath("//*[@id=\"confirm-demo\"]");

    public void navigate() {
        driver.navigate().to(url);
    }

    public void clickButton() {
        driver.findElement(clickMeButton).click();
    }

    public void alertHandle() {
        driver.switchTo().alert().accept();
    }

    public String getMessage() {
        return driver.findElement(text).getText();
    }
}
