package com.utlimateqa.courses.pages;

import com.utlimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

        By errorMessage = By.xpath("//h1[@class='page__heading']");
        By emailField = By.name("user[email]");
        By passwordField = By.name("user[password]");
        By signInButton = By.xpath("//body[1]/main[1]/div[1]/div[1]/article[1]/form[1]/div[5]/button[1]");

        By signInErrorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getErrorMessage(){

        return getTextFromElement(errorMessage);
    }

    public void enterEmailId(String email){

        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField, password);
    }

    public void clickOnSigninButton(){

        clickOnElement(signInButton);
    }

    public String getSignInErrorMessage(){

        return getTextFromElement(signInErrorMessage);
    }
}
