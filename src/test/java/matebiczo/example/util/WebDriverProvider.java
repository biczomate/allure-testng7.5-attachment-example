package matebiczo.example.util;

import org.openqa.selenium.WebDriver;

public class WebDriverProvider {

    private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public void set(WebDriver webDriver) {
        threadLocal.set(webDriver);
    }

    public WebDriver get() {
        return threadLocal.get();
    }
}
