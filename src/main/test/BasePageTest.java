import com.google.inject.Inject;
import driverFactory.DriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.FluentWait;
import pageObjects.BasePage;

public class BasePageTest {

    @Inject
    private BasePage basePage;

    @Before
    public void setUp() {
        basePage = new BasePage();
    }

    @Test
    public void open() throws Exception {
        basePage.getOpen();
    }

}
