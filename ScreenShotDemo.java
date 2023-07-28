package StepDefenition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShotDemo  {
	@Test
	public  void main() throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\SeleniumConcepts\\driver2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.nasa.gov/multimedia/imagegallery/index.html");
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu dropdown-menu-left']/li)[15]")).click();
		
		//ScreenShot1
		TakesScreenshot scrsht=(TakesScreenshot)driver;
		File screenshotAs = scrsht.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Users\\mathan\\Pictures\\Doc\\img1.png");
		FileHandler.copy(screenshotAs, desti);

		//ScreenShot2
		WebElement element = driver.findElement(By.xpath("(//div[@class='bg-card-canvas'])[1]"));
		File screenshotAs2 = element.getScreenshotAs(OutputType.FILE);
		File Desti2=new File("C:\\Users\\mathan\\Pictures\\Doc\\img2.png");
		FileUtils.copyFile(screenshotAs2, Desti2);
		driver.findElement(By.xpath("(//div[@class='bg-card-canvas'])[3]"));
		
		//ScreenShot3
		WebElement element2 = driver.findElement(By.xpath("//div[@id='ember44']"));
		File screenshotAs3 = element2 .getScreenshotAs(OutputType.FILE);
		File desti3=new File("C:\\Users\\mathan\\Pictures\\Doc\\img3.png");
		FileHandler.copy(screenshotAs3, desti3);





	}

}
