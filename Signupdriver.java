package Driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import mobileworld.Pageobjectfact;



public class Signupdriver {
	@Test
	public void Driver() {

			    System.setProperty("webdriver.chrome.driver","./s/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				// driver =new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.get("https://mobileworld.azurewebsites.net/");
				driver.manage().window().maximize();
				Pageobjectfact  sp=new Pageobjectfact (driver);
				sp.sigin().click();
				sp.signup().click();
				sp.firstname().sendKeys("Akshay");
				sp.lastname().sendKeys("D M");
				sp.Email().sendKeys("akshayclk1@gmail.com");
				sp.pass().sendKeys("12133");
				sp.dateofbirth().sendKeys("21-09-9987");
				sp.gender().click();
				sp.mnumber().sendKeys("99808878788");
				sp.bio().sendKeys("hey everyone");
				sp.button().click();
				driver.switchTo().alert().accept();
				sp.submit().click();
				//driver.switchTo().alert().accept();

			}

		

}
