package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionPage {

    WebDriver driver;

    public TransactionPage(WebDriver driver) {

        this.driver = driver;

    }

    By transactionLink = By.linkText("Hotels");

    public void viewTransactions() {

        driver.findElement(transactionLink).click();

    }

}