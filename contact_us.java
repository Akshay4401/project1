package project2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class contact_us {
    @Test(priority=1)
    public void contact() throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\akshay.dm\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net");
        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])")).click();
        driver.findElement(By.linkText("Contact Us")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        Thread.sleep(3000);
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Akshay");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("akshayclk1@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys("9980885995");
        driver.findElement(By.name("message")).sendKeys("Hii Everyone");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.quit();
}
}


