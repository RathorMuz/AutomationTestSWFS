package objects;

import Setup.Setup;
import Setup.Setup.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddToCart extends Setup {
    public AddToCart(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(Setup.driver, this);
    }

    //Web Elements for Add to Cart button, Cart icon, Cart badge
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement addToCartbtn;
    @FindBy(css = "span.shopping_cart_badge")
    public WebElement cartBadge;
    @FindBy(css = "a.shopping_cart_link")
    public WebElement cartIcon;
    @FindBy(css = "div.cart_item")
    public WebElement itemAddedInCart;

    public void checkUserIsOnMainPage()
    {
        String loggedInURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedInURL, "https://www.saucedemo.com/inventory.html");
    }

    public void addtoCart()
    {
        addToCartbtn.click();
    }

    public void checkCartBadgeQuantity()
    {
        String cartBadgeNumOfItems = cartBadge.getText();
        Assert.assertEquals(cartBadgeNumOfItems,1);
    }

    public void clickCartIcon()
    {
        cartIcon.click();
    }

    public void checkIfCartItemAdded()
    {
        itemAddedInCart.isDisplayed();
    }

}
