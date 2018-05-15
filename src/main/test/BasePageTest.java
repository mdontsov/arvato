import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
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
