package Assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*","--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Leaf@123");
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement mobilePublisher = driver.findElement(By.xpath("//span[text()='Learn More']"));
		mobilePublisher.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> childwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(childwindow.get(1));
		
		WebElement button = driver.findElement(By.xpath("//button[text()='Confirm']"));
		button.click();
		
	
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		
		Actions act = new Actions(driver);
		WebElement learning = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		act.moveToElement(learning).perform();
		
		shadow.setImplicitWait(10);
	    WebElement certification = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		act.scrollToElement(certification).click(certification).perform();
		
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		
		WebElement summary = driver.findElement(By.xpath("//div[contains(@class,'cert-site_text slds-text-align--center')]"));
		String text = summary.getText();
		System.out.println("Summary of Salesforce Architect : "+text);
		
		System.out.println("*********************************************");
		
		List<WebElement> certificate = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	   
		for (WebElement Architectcertificate : certificate) 
		{
		   String text2 = Architectcertificate.getText();
		   System.out.println("Salesforce Architect certificate are"+ text2);
	    }
	   
	   driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	   
	   System.out.println("************************************************");
	   
	   List<WebElement> certifications = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	   
	   for (WebElement Architectcertifications  : certifications)
	   {
		String text3 = Architectcertifications.getText();
		System.out.println("Architect Certifications are :"+text3);
		
	}
	}

}
