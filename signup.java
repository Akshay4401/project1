package project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signup {
	WebDriver driver;
	@BeforeMethod
    public void sign()  throws InterruptedException 

{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://mobileworld.azurewebsites.net/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
	driver.findElement(By.xpath("//a[@href='signup.html']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Akshay");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("D M");
	driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("akshayclk1@gmail.com");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Akshay@123");
	driver.findElement(By.xpath("//input[@type='date']")).sendKeys("12-10-1999");
	driver.findElement(By.xpath("//div[@class='col-md-2']/input[@type='radio']")).click();
	driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("9980885995");
	driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("Hey");
	driver.findElement(By.xpath("//button[@class='btn btn-info form-control']")).click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//button[@type='Submit']")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.quit();
}
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Akshay");
		driver.findElement(By.id("password")).sendKeys("Akshay@123");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block']")).click();
		driver.quit();
}    
}


