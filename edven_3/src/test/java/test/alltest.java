package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.googleHome;

public class alltest {
	private static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		//setup chrome driver
		WebDriverManager.chromedriver().setup();
		
		//initialize chrome
		 driver = new ChromeDriver();
		
		//open page
		driver.get("https://www.google.com/");
	};
	@Test(priority=0, enabled=true)
	public  void pageInput() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		googleHome.home(driver).sendKeys("shivam");
		googleHome.home(driver).sendKeys(Keys.ENTER);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
	}
	

}
