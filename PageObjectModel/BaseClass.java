package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	public  ChromeDriver driver;
	
	@BeforeMethod
	public void lanuchBrowser() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver= new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}

}
