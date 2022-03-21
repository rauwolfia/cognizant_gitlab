package cognizant_gitlab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitlabTest {
	
	static WebDriver driver;

	@BeforeTest
	public static void openBrowser() {
		
// first push demo - confirm 
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		
		
	}
	
	@Test
	public static void googleSearch() {
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("helloworld");
		driver.findElement(By.name("q")).submit();
		
		
	}
	
	@Test
	public static void facebookLogin() {
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("email@facebook.com");
		
	}
	
	
	@AfterTest
	public static void tearDown() {
	driver.quit();
	}
	
	
	

}
