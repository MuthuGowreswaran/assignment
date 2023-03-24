package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class Home extends BaseClass {
	
	public Home(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
	public Home verifyHomePage() {
		
		boolean displayed = driver.findElement(By.partialLinkText("CRM/SFA")).isDisplayed();
		
		if(displayed) {
			System.out.println("The Button is Displyed");
		}
		else {
			System.out.println("This Not Display");
		}
		return this;
	}
	
	public Login clickLogout() {
		
		
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		logout.click();
		
		return new Login(driver);
	}
	
	public MyHome clickCrmsfa() {
		
		WebElement button = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')] "));
		button.click();
		
		return new MyHome(driver);
	}

}
