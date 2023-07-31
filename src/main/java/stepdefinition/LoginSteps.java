package stepdefinition;

import Setup.Setup;
import objects.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class LoginSteps extends Setup {

    Login login = new Login(driver);

    @BeforeSuite
    public void beforeSuite()
    {
        setup_browser();
    }
    @AfterSuite
    public void afterSuite()
    {
        close_browser();
    }

    @Given("User is on saucedemo application login page")
    public void user_is_on_saucedemo_application_login_page()
    {
        login.checkUserIsOnLoginPage();
    }

    @When("user enter the correct username")
    public void user_enter_the_correct_username()
    {
        login.enterUsername();
    }

    @When("user enter the correct password")
    public void user_enter_the_correct_password()
    {
        login.enterPassword();
    }

    @When("user click on the login button")
    public void user_click_on_the_login_button()
    {
        login.clickLoginbtn();
    }

    @Then("user should be logged in successfully and be taken to inventory page")
    public void user_should_be_logged_in_successfully_and_be_taken_to_inventory_page()
    {
        login.checkUserIsOnMainPage();
    }

    @When("user enter the incorrect username")
    public void user_enter_the_incorrect_username()
    {
        login.enterIncorrectUsername();
    }

    @When("user enter the incorrect password")
    public void user_enter_the_incorrect_password()
    {
        login.enterIncorrectPassword();
    }

    @Then("user should not be logged in and error message should show")
    public void user_should_not_be_logged_in_and_error_message_should_show()
    {
        login.checkUserIsOnLoginPage();

    }
}