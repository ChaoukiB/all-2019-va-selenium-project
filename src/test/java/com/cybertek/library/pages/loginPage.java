package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement email ;

    @FindBy(id = "inputPassword")
    public WebElement password ;

    @FindBy(tagName ="button")
    public WebElement logIn ;


    public void login(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        logIn.click();
    }
}
