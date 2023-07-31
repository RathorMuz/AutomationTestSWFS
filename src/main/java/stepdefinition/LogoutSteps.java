package stepdefinition;

import Setup.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Logout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class LogoutSteps extends Setup {

    Logout logout = new Logout(driver);
    @Given("User is logged in")
    public void user_is_logged_in()
    {
        logout.checkUserIsLoggedIn();
    }

    @When("user click on menu icon")
    public void user_click_on_menu_icon() throws InterruptedException {
        logout.clickMenuIcon();
        Thread.sleep(250);
    }
    @When("click on Logout")
    public void click_on_Logout()
    {
        logout.clickLogoutButton();
    }

    @Then("user should be logged out from application")
    public void user_should_be_logged_out_from_application()
    {
        logout.checkUserIsLoggedOut();
    }
}