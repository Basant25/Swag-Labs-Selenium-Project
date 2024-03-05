package automation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    String validUserName= "standard_user";
    String validPassword= "secret_sauce";
    String inValidUserName= "standard_userr";
    String invalidPassword= "secret_saucee";

    //Elements
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By testElement = By.className("peek");
    By errorBtn = By.className("error-button");


    @Test

    public void validLogin (){
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(testElement).isDisplayed();
        Assert.assertTrue(isDisplayed);

    }

    @Test

    public void invalidLogin () {
        driver.findElement(userName).sendKeys(inValidUserName);
        driver.findElement(password).sendKeys(invalidPassword);
        driver.findElement(loginBtn).click();
        boolean isDisplayed = driver.findElement(errorBtn).isDisplayed();
        Assert.assertTrue(isDisplayed);

    }
}
