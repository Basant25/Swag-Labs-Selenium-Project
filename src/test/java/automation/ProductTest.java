package automation;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest{
    String validUserName = "standard_user";
    String validPassword = "secret_sauce";
    String productName = "Sauce Labs Bolt T-Shirt";
    String expectedPrice = "$15.99";


    //Elements
    By userName = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");
    By productLink = By.xpath("//div[text()=\"" + productName + "\"]");
    By productPrice = By.className("inventory_details_price");
    By addToCart = By.xpath("//button[@class='btn_primary btn_inventory']");
    By checkCart = By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']");
    By checkout = By.xpath("//a[@class='btn_action checkout_button']");
    By removeItem = By.xpath("//button[@class='btn_secondary cart_button']");
    By continueShopping = By.xpath("//a[@class='btn_secondary']");


    @Test

    public void validateProductPrice() {
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(productLink).click();
        String actualValue = driver.findElement(productPrice).getText();
        Assert.assertEquals(actualValue, expectedPrice);

    }

    @Test
    public void validateCart() {
        driver.findElement(userName).sendKeys(validUserName);
        driver.findElement(password).sendKeys(validPassword);
        driver.findElement(loginBtn).click();
        driver.findElement(productLink).click();
        driver.findElement(addToCart).click();
        driver.findElement(checkCart).click();
        driver.findElement(checkout).click();
        driver.navigate().back();
        driver.findElement(removeItem).click();
        driver.findElement(continueShopping).click();

    }
}
