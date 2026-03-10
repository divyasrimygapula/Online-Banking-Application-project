package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.DashboardPage;

public class BalanceTest extends BaseTest{

@Test
public void checkBalance(){

LoginPage login=new LoginPage(driver);

login.login("john","demo");

DashboardPage dash=new DashboardPage(driver);

dash.checkBalance();

}

}