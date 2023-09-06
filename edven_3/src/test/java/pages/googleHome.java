package pages;import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleHome {

	public static WebElement home(WebDriver driver) {
		// TODO Auto-generated method stub
		WebElement element = driver.findElement(By.id("APjFqb"));
		return element;
		//return null;
	};
	
//	public static WebElement btn(WebDriver driver) {
//		WebElement ele1 = driver.findElement() 
//		return ele1;
//	}
}
