package StepDefenition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
	@Test
	   public  void main() {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathan\\eclipse-workspace\\SeleniumConcepts\\driver2\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=15316858002&extra_1=s%7Cc%7C563139538229%7Cb%7Cfacebbook%7C&placement=&creative=563139538229&keyword=facebbook&partner_id=googlesem&extra_2=campaignid%3D15316858002%26adgroupid%3D130780223515%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1438643129%26loc_physical_ms%3D9299790%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw2K6lBhBXEiwA5RjtCTXzaOudHUa67T0mNrH1qQFy0ZDnk-GXes-cK1NpmDvpPnykq5JRkxoC4D0QAvD_BwE");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='mtm _5wa2 _5dbb']/child::span/span[1]/child::input;")).click();
		   
		   
		   
		   
		   
	}
	
	
	
	

}
