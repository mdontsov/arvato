package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static driverFactory.DriverFactory.driver;

public class CRMPage {

    public CRMPage() {
        PageFactory.initElements(driver(), this);
    }

    @FindBy(css = "[id='menu-item-56']")
    public WebElement homeLink;
}
