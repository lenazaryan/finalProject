import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;

public class OpenPage {
    final String BASE_URL = "https://www.facebook.com";

    void navigateToURI(String path) {
        DriverFactory.getDriver().get(BASE_URL + path);
    }

    @BeforeMethod
    public void setUp(){
        DriverFactory.initDriver();
    }

    @AfterMethod (alwaysRun = true)
    public static void quitDriver(){
        DriverFactory.getDriver().quit();
    }
}