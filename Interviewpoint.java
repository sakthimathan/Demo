package StepDefenition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Interviewpoint {
	@Test(invocationCount = 3,threadPoolSize = 3)
	public  void mainfuctin(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathan\\eclipse-workspace\\Workconfig\\Driver\\chromedriver.exe");

		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("cricket",Keys.ENTER);


		List<WebElement> no = driver.findElements(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(no.size());
		driver.quit();
	}

}
