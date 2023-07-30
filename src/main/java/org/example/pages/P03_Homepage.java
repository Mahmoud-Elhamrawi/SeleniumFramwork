package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_Homepage {
    public P03_Homepage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;
     public void GoToRegisterLink()
     {
         registerLink.click();
     }



    @FindBy(className = "ico-login")
    public WebElement loginLink;
    public void GoToLoginLink()
    {
        loginLink.click();
    }







}
