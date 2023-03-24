package Week1day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS",Keys.TAB);
		
		
		WebElement To = driver.findElement(By.id("txtStationTo"));
		To.clear();
		To.sendKeys("MDU",Keys.TAB);
		
		WebElement checkBox = driver.findElement(By.id("chkSelectDateOnly"));
		checkBox.click();
		
		List<WebElement> allrow = driver.findElements(By.xpath("(//table[contains(@class,'DataTable TrainList')])/tbody/tr/td[2]"));
		
		for (WebElement webElement : allrow) {
			String names=webElement.getText();
			System.out.println(names);
			
		}
		
		
		}
		

}
