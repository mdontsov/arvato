import com.google.inject.Inject;
import driverFactory.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class BasePageTest {

    @Inject
    private BasePage basePage;

    @Before
    public void setUp() {
        basePage = new BasePage();
    }

    @After
    public void tearDown() {
        basePage.getDriver().quit();
    }

    @Test
    public void open() throws Exception {
        basePage.getDriver().get("http://www.google.com");
    }
}
