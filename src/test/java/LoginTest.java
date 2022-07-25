import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends OpenPage {

    @BeforeMethod
    public void openPage() {
        navigateToURI("");
    }

    @Test
    void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterLogin("abc@xyz.com");
        loginPage.enterPassword("abcdef12345");
        loginPage.submitBtn();
    }
}
