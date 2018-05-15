package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static driverFactory.DriverFactory.driver;

public class FrontPage {

    public FrontPage() {
        PageFactory.initElements(driver(), this);
    }

    @FindBy(css = "[id='menu-item-58']")
    public WebElement crmLink;

    @FindBy(xpath = "//a[text()='IT Development Centre']")
    public List <WebElement> itdcLink;
}
