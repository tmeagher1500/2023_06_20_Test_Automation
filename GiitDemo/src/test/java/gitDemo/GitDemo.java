package gitDemo;

import static org.testng.Assert.assertNotNull;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//se_9_1_1:13
public class GitDemo {
	static WebDriver driver;
	
	public static void main(String[] args) {
	setUp();
	gotoSite();
	tearDown();
	
	}
	
	public static void setUp () {
		try {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		} catch (Exception e) {
			System.out.println("Setup Error: " + e);
		}
		System.out.println("Setup successfully");
	}
		
	public static void gotoSite () {
		try {
		driver.get("https://www.thegreatcourses.com/");
		System.out.println("Page title: " + driver.getTitle());
//		WebElement partnerElem = driver.findElement(By.cssSelector("p.Partners-Title.col-24"));
//		assertNotNull(partnerElem);
		//#root > main > section.Partners > div > div.row-cols-1.justify-content-center.row > p.Partners-Title.col-24
		} catch (Exception e) {
			System.out.println("Go to site Error: " + e);
		}
		System.out.println("Navigated to site succesfully");
		
	}
	
	public static void tearDown () {
		try {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		} catch (Exception e) {
			System.out.println("Tear Dowm Error: " + e);
		}
		System.out.println("Tear down successfully");
	}

}
