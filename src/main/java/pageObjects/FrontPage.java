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

    @FindBy(xpath = "//a[text()='CRM & Customer Services']")
    public List <WebElement> crmLink;

    @FindBy(xpath = "//a[text()='IT Development Centre']")
    public List <WebElement> itdcLink;

    @FindBy(xpath = "//a[text()='Home']")
    public List<WebElement> homeLink;

    @FindBy(xpath = "//a[text()='CRM Open positions']")
    public List<WebElement> crmVacanciesLink;

    @FindBy(xpath = "//a[text()='IT Centre Open positions']")
    public List<WebElement> itcVacanciesLink;

    @FindBy(xpath = "//a[text()='EU Project']")
    public List<WebElement> euProjectLink;

    @FindBy(xpath = "//a[text()='Contact']")
    public List<WebElement> contactLink;

    @FindBy(css = "a[lang='en-US']")
    public WebElement englishLink;

    @FindBy(css = "a[lang='et']")
    public WebElement estonianLink;

    @FindBy(css = "html")
    public WebElement pageHtml;
}
