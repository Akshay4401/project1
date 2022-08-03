package project2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class genralcode {
		WebDriver driver;
		@BeforeMethod
		public void launch() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver =new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://mobileworld.azurewebsites.net/");
			driver.manage().window().maximize();
		}
		
		
		@AfterMethod
		public void close()
		{
			driver.quit();
		}
}


