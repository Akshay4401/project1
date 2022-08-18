package Pompractice;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice1 {
	
	WebDriver driver;
	
	public Practice1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By sigup=By.xpath("//button[@type='submit']");
	By sigin=By.linkText("Sign up");
	By fname=By.id("myName");
	By lname=By.xpath("//input[@placeholder='Last Name']");
	By email=By.xpath("//input[@type='Email']");
	By pass=By.xpath("//input[@type='Password']");
	By dob=By.xpath("//input[@type='date']");
	By gender=By.xpath("(//input[@type='radio'])[1]");
	By number=By.xpath("//input[@type='number']");
	By bio=By.xpath("//*[@placeholder='Short Bio']");
	By register=By.xpath("//*[@type='submit']");
	By ok=By.xpath("//button[@type='Submit']");
	public WebElement signup()
	{
		return driver.findElement(sigup);
	}
	public WebElement signin()
	{
		return driver.findElement(sigin);
	}
	public WebElement firstname()
	{
		return driver.findElement(fname);
	}
	public WebElement lastname()
	{
		return driver.findElement(lname);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement password()
	{
		return driver.findElement(pass);
	}
	public WebElement dateofbirth()
	{
		return driver.findElement(dob);
	}
	public WebElement gender()
	{
		return driver.findElement(gender);
	}
	
	public WebElement mnumber()
	{
		return driver.findElement(number);
	}
	public WebElement bio()
	{
		return driver.findElement(bio);
	}
	public WebElement register()
	{
		return driver.findElement(register);
	}
	public WebElement nextpage()
	{
		return driver.findElement(ok);
	}

}
