package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.example.pages.P01_UserRegister;
import org.example.pages.P03_Homepage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_regStepDef {

    P01_UserRegister register = new P01_UserRegister(Hooks.driver);
    P03_Homepage homepage = new P03_Homepage(Hooks.driver);


    @Given("User is on homepage")
    public void user_is_on_homepage() {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("User click on regiter link")
    public void user_click_on_regiter_link() {
      homepage.GoToRegisterLink();
        Assert.assertEquals("Register",register.AssertH1.getText());
    }


    @And("User select gender type male")
    public void user_select_gender_type_male() {
    register.genederRadioBtn.click();
    }

    @And("User enter fist name {string}")
    public void userEnterFistName(String fn) {
        register.FNInput.sendKeys(fn);
    }

    @And("User enter last name {string}")
    public void userEnterLastName(String ls) {
        register.LNInput.sendKeys(ls);
    }



    @And("User Select Day {string}")
    public void userSelectDay(String day) {
        Select select =new Select(register.DateOfBirthDay) ;
        select.selectByValue(day);
    }

    @And("User Select Month {string}")
    public void userSelectMonth(String mon) {
        Select select =new Select(register.DateOfBirthMonth) ;
        select.selectByValue(mon);
    }


    @And("User Select year {string}")
    public void userSelectYear(String yea) {
        Select select =new Select(register.DateOfBirthYear) ;
        select.selectByValue(yea);

    }

    @And("User enter emaail {string}")
    public void userEnterEmaail(String em) {

        register.emailInput.sendKeys(em);
    }


    @And("User enter password {string}")
    public void userEnterPassword(String pass) {
        register.passInput.sendKeys(pass);
    }

    @And("User enter confirmPassword {string}")
    public void userEnterConfirmPassword(String cpass) {
        register.ConfirmPasInput.sendKeys(cpass);
    }


    @And("User click on register button")
    public void user_click_on_register_button() {
    register.regButton.click();
    }

    @Then("User register successfully with new account")
    public void user_register_successfully_with_new_account() {
     Assert.assertEquals("Your registration completed",register.AssertMsgSuccess.getText());
//     Assert.assertTrue(register.AssertMsgSuccessLogout.getText().contains("out"));

    }









}
