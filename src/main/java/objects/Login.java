package objects;
import Setup.Setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login extends Setup {
    public Login(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebElements for username, password and login button:

    @FindBy(id = "user-name")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(css = "input.submit-button")
    public WebElement loginbtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement errormsg;

    //Methods
    public void checkUserIsOnLoginPage()
    {
        String userURL = driver.getCurrentUrl();
        Assert.assertEquals(userURL,"https://www.saucedemo.com/");
    }
    public void enterUsername()
    {
        username.sendKeys("standard_user");
    }
    public void enterPassword()
    {
        password.sendKeys("secret_sauce");
    }
    public void clickLoginbtn()
    {
        loginbtn.click();
    }

    public void checkUserIsOnMainPage()
    {
        String mainPage = driver.getCurrentUrl();
        Assert.assertEquals(mainPage,"https://www.saucedemo.com/inventory.html");
    }

    public void enterIncorrectUsername()
    {
        username.sendKeys("wrong_user");
    }

    public void enterIncorrectPassword()
    {
        password.sendKeys("secret_spice");
    }
    public void displayErrorMessage()
    {
        String error = errormsg.getText();
        System.out.println(error);
    }
}
