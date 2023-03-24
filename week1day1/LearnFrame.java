package week1day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01ih0d0l2jt7q51nso92yy7nvl0171978.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//handle index based Frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		
		driver.switchTo().defaultContent();
		
		//handle Nested Frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		
		WebElement element = driver.findElement(By.id("Click"));
		element.click();
		
		//print the text
		String text = element.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		//Count Frame
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total Frame = "+frame.size());
		

	}

}
