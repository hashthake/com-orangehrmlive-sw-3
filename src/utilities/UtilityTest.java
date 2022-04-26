package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;

public class UtilityTest extends BaseTest {

    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }
    public void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
}
