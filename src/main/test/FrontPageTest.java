import com.google.inject.Inject;
import driverFactory.DriverActions;
import driverFactory.DriverFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pageObjects.CRMPage;
import pageObjects.FrontPage;

public class FrontPageTest extends DriverFactory implements DriverActions {

    @Inject
    private FrontPage frontPage;

    @Inject
    private CRMPage crmPage;

    @Before
    public void setUp() {
        frontPage = new FrontPage();
        crmPage = new CRMPage();
    }

    @After
    public void tearDown() {
//        quit();
    }

    @Test
    public void open() throws Exception {
        openUrl("http://www.arvato.ee");
        click(frontPage.crmLink);
        click(crmPage.homeLink);
    }
}
