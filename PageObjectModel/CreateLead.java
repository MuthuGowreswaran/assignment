package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class CreateLead extends BaseClass{
	public CreateLead(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
	public CreateLead enterCompanyName() {
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Teatleaf");
		return this;
	}
	
    public CreateLead enterFirstName() {
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_firstName"));
		companyName.sendKeys("Muthu");
		return this;
	}
    
    public CreateLead enterLastName() {
		
		WebElement companyName = driver.findElement(By.id("createLeadForm_lastName"));
		companyName.sendKeys("M");
		return this;
	}
    
     public ViewLead clickCreate() {
		
		WebElement companyName = driver.findElement(By.className("smallSubmit"));
		companyName.sendKeys("M");
		return new ViewLead(driver);
	}
    
    
    
}
