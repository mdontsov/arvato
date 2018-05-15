package pageObjects;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends DriverFactory {

    public BasePage() {
        PageFactory.initElements(driver(), this);
    }

    public void getOpen() {
        String url = "http://www.arvato.ee";
        getDriver().get(url);
    }

    public WebDriver getDriver() {
        return driver();
    }
}
