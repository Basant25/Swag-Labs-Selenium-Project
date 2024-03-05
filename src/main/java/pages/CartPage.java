package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;
    String productName = "Sauce Labs Bolt T-Shirt";

    //Elements

    By addToCart = By.xpath("//button[@class='btn_primary btn_inventory']");
    By checkCart = By.xpath("//*[@class='svg-inline--fa fa-shopping-cart fa-w-18 fa-3x ']");
    By checkout = By.xpath("//a[@class='btn_action checkout_button']");
    By removeItem = By.xpath("//button[@class='btn_secondary cart_button']");
    By continueShopping = By.xpath("//a[@class='btn_secondary']");

    //Actions

    public void validateCart(){
        driver.findElement(addToCart).click();
        driver.findElement(checkCart).click();
        driver.findElement(checkout).click();
        driver.navigate().back();
        driver.findElement(removeItem).click();
        driver.findElement(continueShopping).click();

    }
}
