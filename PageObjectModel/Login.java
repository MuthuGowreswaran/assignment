package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class Login extends BaseClass {
	
	public Login(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
public  Login enterUsername() {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		return this;
	}
	public Login enterPassword() {
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		return this;
	}
	
	public  Home clickLogin() {
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		return new Home(driver);
	}


}
