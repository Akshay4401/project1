package Pomdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Pompractice.Practice1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driver1 {
	@Test
	public void launch()
	{
		
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		Practice1 p1=new Practice1(driver);
		p1.signup().click();
		p1.signin().click();
		p1.firstname().sendKeys("Akshay");
		p1.lastname().sendKeys("D M");
		p1.Email().sendKeys("akshayclk1@gmail.com");
		p1.password().sendKeys("Hello@123");
		p1.dateofbirth().sendKeys("21-09-1998");
		p1.gender().click();
		p1.mnumber().sendKeys("9980885885");
		p1.bio().sendKeys("hey everyone");
		p1.register().click();
		driver.switchTo().alert().accept();
		p1.nextpage().click();
		
	}

}
