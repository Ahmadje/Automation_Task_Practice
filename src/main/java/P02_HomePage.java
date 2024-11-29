import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;

    //Constructor
    public P02_HomePage(SHAFT.GUI.WebDriver driver){this.driver = driver;}

    //Locators
    By menListBtn = By.xpath("//a[@href=\"#Men\"]");
    By tshirtBtn = By.xpath("//a[@href=\"/category_products/3\" and contains(.,'Tshirts ')]");

    //Methods
    public void navigateToProducts(){
        driver.element().click(menListBtn).
                click(tshirtBtn);
    }
}
