package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;

    String productName = "Sauce Labs Bolt T-Shirt";

    //elements
    By testElement = By.className("peek");
    By productLink = By.xpath("//div[text()=\"" + productName + "\"]");

    public void openProduct() {
        driver.findElement(productLink).click();
    }

    }

