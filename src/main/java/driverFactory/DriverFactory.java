package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    private final static String DRIVER = "webdriver.gecko.driver";

    protected DriverFactory() {
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            System.setProperty(DRIVER, "src/main/resources/geckodriverWin.exe");
        } else if (osName.contains("nix") || osName.contains("nux")) {
            System.setProperty(DRIVER, "src/main/resources/geckodriverLinux");
        } else if (osName.contains("mac")) {
            System.setProperty(DRIVER, "src/main/resources/geckodriverMac");
        } else {
            throw new IllegalStateException("Unsupported OS");
        }

        driver = new FirefoxDriver(firefoxOptions());
    }

    private FirefoxOptions firefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--ignore-certificate-errors");
        return firefoxOptions;
    }
}
