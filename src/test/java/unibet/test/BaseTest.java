// src/test/java/unibet/test/BaseTest.java

package unibet.test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import unibet.pages.*;

public class BaseTest {
    protected WebDriver driver;
    protected UnibetBlogPage unibetBlogPage;

    
	
	@BeforeClass
    
	public void setUp() {

	    /*
	     * Enable WebDriver Manager by default, as the chromedriver path is not specified (commented out).
	     * To disable WebDriver Manager and use a specific chromedriver path, uncomment and modify the line below.
	     */
	    // WebDriverManager.chromedriver().setup();

	    // Uncomment and modify the line below to use a specific chromedriver path.
	    // System.setProperty("webdriver.chrome.driver", "/Users/vijaypatankar/Documents/chromedriver");

	    // Initialize ChromeDriver
	    driver = new ChromeDriver();

	    // Initialize UnibetBlogPage
	    unibetBlogPage = new UnibetBlogPage(driver);

	    // Navigate to the Unibet blog page
	    driver.get("https://www.unibet.co.uk/blog");

	    // Maximize the browser window
	    driver.manage().window().maximize();

	    // Set an implicit wait for 3 seconds
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}


 

	 @AfterClass
	 public void tearDown() {
		    // Check if the driver instance exists before quitting the browser
		    if (driver != null) {
		        driver.quit();
		    }
		}
	        

	 }
	



