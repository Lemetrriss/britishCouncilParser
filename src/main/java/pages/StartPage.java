package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage {

    public StartPage() {
        PageFactory.initElements(this.driver, this);
    }

    public void closeDriver(){
        driver.close();
    }

    public void quitDriver(){
        driver.quit();
    }

    @FindBy(css = "#navigation")
    public WebElement elementMainMenu;

    @FindBy(css = "li#menu-55112-1 > a")
    public WebElement elementHome;

    @FindBy(css = "li#menu-57931-1 > a")
    public WebElement elementCourses;

    @FindBy(css = "li#menu-56288-1 > a")
    public WebElement elementSkills;

    @FindBy(css = "li#menu-56343-1 > a")
    public WebElement elementGrammar;

    @FindBy(css = "li#menu-56453-1 > a")
    public WebElement elementVocabulary;

    @FindBy(css = "li#menu-56347-1 > a")
    public WebElement elementBusinessEnglish;

    @FindBy(css = "li#menu-56354-1 > a")
    public WebElement elementGeneralEnglish;

    @FindBy(css = "li#menu-56351-1 > a")
    public WebElement elementIELTS;

    public WebDriver getGeneralEnglish(){
        elementGeneralEnglish.click();
        return driver;
    }

}
