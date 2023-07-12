package Bankingappseleniumpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class bankseleniumproj1 {
	
public class TestLogin{
		
		@Test
		public void login() {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8081");
			WebElement service=driver.findElement(By.name("Services"));
			service.sendKeys("Services");
			String actualUrl="http://localhost:8081/services.html";
			String expectedUrl=driver.getCurrentUrl();
			Assert.assertEquals(expectedUrl,actualUrl);
			
			
		}
	}

}
