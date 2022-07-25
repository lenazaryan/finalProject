import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class LoginPage {
    LoginPage(){
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement loginField;


    @FindBy(xpath = "//*[@id=\"pass\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id='app']/header/a/img")
    private WebElement loginButton;

    void enterLogin(String s){loginField.sendKeys();}
    void enterPassword(String abcdef12345){passwordField.sendKeys();}
    void submitBtn(){loginButton.click();}

}

