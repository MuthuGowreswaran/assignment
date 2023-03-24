package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class MyHome extends BaseClass {
	
	public MyHome(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
	public Leads clickLead() {
	WebElement lead = driver.findElement(By.xpath("//a[text()='Leads']"));
	lead.click();
	return new Leads(driver);
	
	}
	
}
