package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FundTransferPage {

WebDriver driver;

public FundTransferPage(WebDriver driver){

this.driver=driver;

}

By transferFunds=By.linkText("Transfer Funds");

public void clickTransfer(){

driver.findElement(transferFunds).click();

}

}