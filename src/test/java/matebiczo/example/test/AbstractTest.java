package matebiczo.example.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import matebiczo.example.util.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public abstract class AbstractTest {

    protected final WebDriver driver ;

    public AbstractTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverProvider().set(driver);
    }

    @AfterTest
    void afterTest() {
        driver.close();
    }
}
