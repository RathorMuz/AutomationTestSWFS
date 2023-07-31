package objects;

import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Logout extends Setup {
    public Logout(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Web Elements for Menu icon and Logout button
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuIcon;
    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutbtn;

    public void checkUserIsLoggedIn()
    {
        String loggedInURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedInURL, "https://www.saucedemo.com/inventory.html");
    }

    public void clickMenuIcon()
    {
        menuIcon.click();
    }

    public void clickLogoutButton()
    {
        logoutbtn.click();
    }

    public void checkUserIsLoggedOut()
    {
        String loggedOutURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedOutURL,"https://www.saucedemo.com/");
    }

}
