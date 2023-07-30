package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static   WebDriver driver;
    @Before
    public void OpenBrowser()
    {
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("https://demo.nopcommerce.com/");

    }



    @After
    public void QuitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
