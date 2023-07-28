package StepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Demo {

	public static  void main(String[] arg) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\Workconfig\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.functionize.com/demo");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sakthi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Balan");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mmathan161@renu.com");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7548392876");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("TCS");
		WebElement element = driver.findElement(By.xpath("//select[@name='job_role']"));
		Select sc=new Select(element);
		sc.selectByValue("QA Engineer / Test Engineer / SDET");
		WebElement element2 = driver.findElement(By.xpath("//select[@name='biggest_software_challenge']"));
		Select sc1=new Select(element2);
		sc1.selectByVisibleText("Aligning development with testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		driver.quit();
		
		
		
		
	}

}
