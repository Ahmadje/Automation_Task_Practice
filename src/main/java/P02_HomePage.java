import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P02_HomePage(SHAFT.GUI.WebDriver driver){this.driver = driver;}

    //Locators
    By menListBtn = By.xpath("//a[@href=\"#Men\"]");
    By tshirtBtn = By.xpath("//a[@href=\"/category_products/3\" and contains(.,'Tshirts ')]");

    //Methods
    @Step("Navigate to Products page")
    public P03_ProductPage navigateToProducts(){
        driver.element().click(menListBtn).
                click(tshirtBtn);
        return new P03_ProductPage(driver);
    }
}
