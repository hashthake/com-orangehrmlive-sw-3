package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityTest;

public class LginTest extends UtilityTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldLoginWithValidCredential(){
        sendTextToElement(By.id("txtUsername"), "Admin");
        sendTextToElement(By.id("txtPassword"), "admin123");
        clickOnElement(By.id("btnLogin"));
        String expectedText = "Welcome Fathi";
        String actualText = getTextFromElement(By.id("welcome"));
        Assert.assertEquals(expectedText,actualText);

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}
