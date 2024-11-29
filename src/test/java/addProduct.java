import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class addProduct {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testJson;
    SHAFT.TestData.EXCEL testExcel;

    @Test(description = "Navigate to Products nad Add items with price less than 1000 ")
    public void addProductsToCart() {
        new P01_LoginPage(driver).loginSteps(testExcel.getCellData("userName"), testJson.getTestData("password")).
                navigateToProducts().
                addProducts().
                productsVerifications();
    }


    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://automationexercise.com/login");
        testJson = new SHAFT.TestData.JSON(SHAFT.Properties.paths.testData() + "testData.json");
        testExcel = new SHAFT.TestData.EXCEL(SHAFT.Properties.paths.testData() + "testData.xlsx");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
