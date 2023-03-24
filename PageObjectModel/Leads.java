package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class Leads extends BaseClass {
	
	public Leads(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
	public CreateLead clickCreateLead() {
		
		WebElement createLead = driver.findElement(By.xpath("//a[text()='Create Lead'] "));
		createLead.click();
		return new CreateLead(driver);
	}

}
