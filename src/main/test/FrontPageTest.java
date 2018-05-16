import com.google.inject.Inject;
import driverFactory.DriverActions;
import driverFactory.DriverFactory;
import org.junit.After;
import org.junit.Assert;
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
        quit();
    }

    @Test
    public void open() throws Exception {
        openUrl("http://www.arvato.ee");
        Assert.assertTrue(isClickable(frontPage.homeLink));
        Assert.assertTrue(isClickable(frontPage.crmLink));
        Assert.assertTrue(isClickable(frontPage.itdcLink));
        Assert.assertTrue(isClickable(frontPage.crmVacanciesLink));
        Assert.assertTrue(isClickable(frontPage.itcVacanciesLink));
        Assert.assertTrue(isClickable(frontPage.euProjectLink));
        Assert.assertTrue(isClickable(frontPage.contactLink));
        Assert.assertTrue(isClickable(frontPage.englishLink));
        Assert.assertTrue(isClickable(frontPage.estonianLink));
        clickLink(frontPage.estonianLink);
        Assert.assertTrue(frontPage.pageHtml.getAttribute("lang").equalsIgnoreCase("et"));
    }
}
