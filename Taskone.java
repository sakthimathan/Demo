package StepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Taskone {
	
	@Test
	public  void main() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\SeleniumConcepts\\driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	 
		driver.findElement(By.id("email")).sendKeys("mmathan161@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sakthi1997@");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
