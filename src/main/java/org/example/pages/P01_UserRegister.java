package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class P01_UserRegister {


    public P01_UserRegister(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "gender-male")
    public WebElement genederRadioBtn;

    @FindBy(id = "FirstName")
    public WebElement FNInput ;

    @FindBy(id = "LastName")
    public WebElement LNInput ;

    @FindBy(name = "DateOfBirthDay")
    public WebElement DateOfBirthDay;

    @FindBy(name = "DateOfBirthMonth")
    public WebElement DateOfBirthMonth;

    @FindBy(name = "DateOfBirthYear")
    public WebElement DateOfBirthYear;
    @FindBy(id = "Email")
    public WebElement emailInput;

    @FindBy(id="Password")
    public WebElement passInput;
    @FindBy(id = "ConfirmPassword")
    public WebElement ConfirmPasInput;

    @FindBy(name = "register-button")
    public WebElement regButton;


    @FindBy(tagName = "h1")
    public  WebElement AssertH1;


    @FindBy(css = "div[class=\"result\"]")
    public  WebElement AssertMsgSuccess;

//    @FindBy(linkText = "Log out")
//    public  WebElement AssertMsgSuccessLogout;











}
