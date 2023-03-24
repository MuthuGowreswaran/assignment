package week1day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://leafground.com/alert.xhtml;jsessionid=node01jy6ghei3ytcxlcpujlq9yxsi23365.node0");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        //handle a simpleAlert
        
        WebElement element = driver.findElement(By.xpath("//span[text()='Show']"));
        element.click();
        
        //Use SwitchTo Alert & use getTextmethod()
        
        Alert simpleAlert = driver.switchTo().alert();
        String text = simpleAlert.getText();
        System.out.println(text);
        
        //Accept the Alert
        simpleAlert.dismiss();
        
        //handle confirm Alert
        
        WebElement element1 = driver.findElement(By.xpath("(//span[text()='Show'])[2]"));//h5[contains(text(),'Confirm Dialog')]/following::span[text()='Show']
        element1.click();
        
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.dismiss();
        
        
        //handle prompt Alert
        
        WebElement promAlert = driver.findElement(By.xpath("(//span[text()='Show'])[5]"));
		promAlert.click();
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("muthu");
		promptAlert.accept();
		
		//handle SweetAlert
		
		WebElement SweetAlert = driver.findElement(By.xpath("//span[text()='Delete']"));
		SweetAlert.click();
		
		WebElement acceptTheAlert = driver.findElement(By.xpath("//span[text()='Yes']"));
		acceptTheAlert.click();
	}

}
