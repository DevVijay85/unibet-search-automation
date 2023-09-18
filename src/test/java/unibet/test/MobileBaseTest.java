// src/test/java/unibet/test/MobileBaseTest.java

package unibet.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import org.testng.annotations.BeforeTest;
import unibet.pages.UnibetBlogPage;

public class MobileBaseTest {
    protected AndroidDriver driver;
    protected UnibetBlogPage unibetBlogPage;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        // Appium server setup code
        AppiumDriverLocalService service = new AppiumServiceBuilder()
                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"))
                .withIPAddress("127.0.0.1")
                .usingPort(4723)
                .build();
        // Starting service
        service.start();

        UiAutomator2Options options = new UiAutomator2Options();

        // Desired capabilities
        options.setDeviceName("VijayPhone");
        
        /* Enable WebDriver Manager by default, as the chromedriver path is not specified (commented out).
	     * To disable WebDriver Manager and use a specific chromedriver path, uncomment and modify the line below. */
        
        //options.setChromedriverExecutable("/Users/vijaypatankar/Documents/chromedriver 2");
       
        options.setCapability("browserName", "Chrome");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

        // Launching application in mobile web
        driver.get("https://www.unibet.co.uk/blog");

        // Setting up implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        unibetBlogPage = new UnibetBlogPage(driver);
    }
}
