package matebiczo.example.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TheTest extends AbstractTest {

    @Test
    public void firstTest() {
        driver.get("https://www.google.co.uk/");
        driver.findElement(By.id("nothing"));
    }

    @Test
    public void secondTest() {
        assertTrue(true);
    }
}

