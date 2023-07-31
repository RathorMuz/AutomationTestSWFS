package stepdefinition;

import Setup.Setup;
import Setup.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.AddToCart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddToCartSteps extends Setup {

    AddToCart atc = new AddToCart(driver);
    @Given("User is on main page")
    public void user_is_on_main_page() {
        atc.checkUserIsOnMainPage();
    }

    @When("user click on Add to cart button")
    public void user_click_on_add_to_cart_button()
    {
        atc.addtoCart();
    }

    @When("click on cart icon")
    public void click_on_cart_icon()
    {
        atc.clickCartIcon();
    }

    @Then("product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully()
    {
        atc.checkCartBadgeQuantity();
    }

    @Then("item should show in cart")
    public void item_should_show_in_cart()
    {
        atc.checkIfCartItemAdded();
    }
}

