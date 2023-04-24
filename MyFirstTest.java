import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {

    @Test
    public void testGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vyshnevskyi.y\\IdeaProjects\\New Project\\src\\main\\resources\\WebDrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //if (driver.getTitle().contains("Google")) {
            //System.out.println("Zdorova Sanya");
       // } else {
           //System.out.println("Заголовок страницы не содержит слово Google");

        //}
        Assert.assertEquals(driver.getTitle(), "Google1" );

        driver.quit();
    }
}
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
//<suite name="Test Suite">
//<test name="My Test">
//<classes>
//<class name="com.example.tests.MyTest" />
//</classes>
//</test>
//</suite>
