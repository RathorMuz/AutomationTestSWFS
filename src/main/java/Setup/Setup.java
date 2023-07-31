package Setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {

        public static WebDriver driver;
        public void setup_browser(){
            WebDriverManager.chromedriver().setup();
            ChromeDriverService service = ChromeDriverService.createDefaultService();
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(service, options);
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
        }

        public void close_browser()
        {
            driver.close();
            driver.quit();
        }

    }

