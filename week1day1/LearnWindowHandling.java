package week1day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Name = driver.findElement(By.id("username"));
		Name.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement welcomepage = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		welcomepage.click();
		
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		
		WebElement merge = driver.findElement(By.xpath("//a[text()='Merge Leads']"));
		merge.click();
		
		String parentWindow = driver.getWindowHandle();
		
	  driver.findElement(By.xpath("(//span[text()='From Lead'])/following:: img")).click();
	  Set<String> child1 = driver.getWindowHandles();
	  List<String> firstwindow = new ArrayList<String>(child1);
	  String string = firstwindow.get(1);
	  driver.switchTo().window(string);
	  
	  driver.findElement(By.xpath("//a[@class='linktext']")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.switchTo().window(parentWindow);
	  
	  driver.findElement(By.xpath("(//span[text()='To Lead'])/following::img")).click();
	  Set<String> child2 = driver.getWindowHandles();
	  List<String> secondwindow = new ArrayList<String>(child2);
	  driver.switchTo().window(secondwindow.get(1));
		
	  driver.findElement(By.xpath("(//a[@class='linktext'])[3]")).click();
	  
	  driver.switchTo().window(parentWindow);
	  
	  driver.findElement(By.xpath("//a[text()='Merge']")).click();
	  
	  Alert alert = driver.switchTo().alert();
	  alert.accept();	
		
	}

}
