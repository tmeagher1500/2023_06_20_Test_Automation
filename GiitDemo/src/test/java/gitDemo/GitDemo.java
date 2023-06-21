package gitDemo;

import static org.testng.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//se_9_1_1:13
public class GitDemo {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.thegreatcourses.com/");
		WebElement partnerElem = driver.findElement(By.cssSelector("p.Partners-Title.col-24"));
		//#root > main > section.Partners > div > div.row-cols-1.justify-content-center.row > p.Partners-Title.col-24
		assertNotNull(partnerElem);
		System.out.println("Page title: " + driver.getTitle());
		System.out.println("Navigated to home page successfully");
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	
	}

}
