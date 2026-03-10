package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

WebDriver driver;

public DashboardPage(WebDriver driver){

this.driver=driver;

}

By accountOverview=By.linkText("Accounts Overview");

public void checkBalance(){

driver.findElement(accountOverview).click();

}

}