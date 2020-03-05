package parse;

import entity.Entity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

public class GetInfo {
    private WebDriver driver;

    public GetInfo(WebDriver driver) {
        this.driver = driver;
    }

    public List<Entity> getAlphabet(){
        List<Entity> entityList = new ArrayList<>();

        List<WebElement> elements = driver.findElements(By.cssSelector("#block-views-glossary-block-1 .attachment.attachment-before a"));

        List<String> letters = new ArrayList<>();
        List<String> list = new ArrayList<>();

        for (WebElement element : elements) {
            list.add(element.getAttribute("href"));
            letters.add(element.getText());
        }

        for (int i = 0; i<list.size(); i++) {
            driver.get(list.get(i));
            List<WebElement> elements1 = driver.findElements(By.cssSelector("#content .view-content tbody a"));
            for (WebElement webElement : elements1) {
                entityList.add(new Entity(letters.get(i), webElement.getText(), webElement.getAttribute("href")));
            }
        }
        return entityList;
    }
}
