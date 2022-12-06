package com.utlimateqa.courses.testsuite;

import com.utlimateqa.courses.pages.HomePage;
import com.utlimateqa.courses.pages.LoginPage;
import com.utlimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){

        homePage.clickOnSignInLink();
        String expectedText = "Welcome Back!";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedText, "Welcome message is not displayed");
    }

    @Test
    public void verifyTheErrorMessage(){
        homePage.clickOnSignInLink();
        loginPage.enterEmailId("admin12349@example.com");
        loginPage.enterPassword("admin1234");
        loginPage.clickOnSigninButton();
        String expectedSigninText = "Invalid email or password.";
        Assert.assertEquals(loginPage.getSignInErrorMessage(), expectedSigninText, "Invalid email or password.");

    }
}
