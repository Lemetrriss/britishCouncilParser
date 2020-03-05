package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "\\britishCouncilParser\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://learnenglish.britishcouncil.org/");
    }

    public BasePage() {

    }
}
