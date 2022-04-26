package testsuite;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityTest;

public class ForgotPasswordTest extends UtilityTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        clickOnElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
        String expectedMessage = "Forgot Your Password?";
        String actualText = getTextFromElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        Assert.assertEquals(expectedMessage,actualText);
    }
}
