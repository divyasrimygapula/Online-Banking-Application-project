package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.FundTransferPage;

public class FundTransferTest extends BaseTest{

@Test
public void verifyTransfer(){

LoginPage login=new LoginPage(driver);

login.login("john","demo");

FundTransferPage transfer=new FundTransferPage(driver);

transfer.clickTransfer();

}

}