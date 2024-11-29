import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_LoginPage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P01_LoginPage(SHAFT.GUI.WebDriver driver){this.driver = driver;}

    //Locators
    By emailInput = By.xpath("//input[@data-qa=\"login-email\"]");
    By passwordInput = By.xpath("//input[@data-qa=\"login-password\"]");
    By loginBtn = By.xpath("//button[@data-qa=\"login-button\"]");

    //Methods
    public P02_HomePage loginSteps(String userName,String password){
        driver.element().type(emailInput,userName).
                type(passwordInput,password).
                click(loginBtn);
        return new P02_HomePage(driver);
    }
}
