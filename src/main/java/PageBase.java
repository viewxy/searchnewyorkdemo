import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class PageBase {
    WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    private final String site = "https://demo.seleniumeasy.com/table-sort-search-demo.html";
    private final By searchBox = By.xpath("//*[@id=\"example_filter\"]/label/input");
    private final By tableRowsName = By.xpath("//*[@id=\"example\"]/tbody/tr/td[1]");

    public void navigate() {
        driver.navigate().to(site);
    }

    public void search(String testData) {
        WebElement searchElement = driver.findElement(searchBox);
        searchElement.sendKeys(testData);
    }

    public String[] readTable() {
        List<WebElement> tableRowsNameElement = driver.findElements(tableRowsName);
        String[] names = new String[tableRowsNameElement.size()];
        for (int i = 0; i < tableRowsNameElement.size(); i++) {
            names[i] = tableRowsNameElement.get(i).getText();
        }
        return names;
    }
}
