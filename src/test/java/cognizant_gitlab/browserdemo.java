package cognizant_gitlab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class browserdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver ();
		
		driver.navigate().to("https://www.google.com/");
		
		String expected = "Google";
		String actual = driver.getTitle();
		
		Assert.assertEquals(actual, expected);
		System.out.println("The title of the page is : " + actual);
		
		driver.quit();

	}
}
		
	

		
