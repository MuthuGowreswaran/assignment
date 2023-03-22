package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class RedBus {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*","--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		
		Actions act = new Actions(driver);
		WebElement city1 = driver.findElement(By.xpath("//li[@class='sub-city']"));
		act.moveToElement(city1).click(city1).perform();
		
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Bangalore");
		
		WebElement city2 = driver.findElement(By.xpath("//li[@class='sub-city']"));
		act.moveToElement(city2).click(city2).perform();
		
		WebElement date = driver.findElement(By.id("onward_cal"));
		date.click();
	
		WebElement day = driver.findElement(By.xpath("(//table[@class='rb-monthTable first last'])/tbody/tr[6]/td[4]"));
		day.click();
		
		WebElement search = driver.findElement(By.id("search_btn"));
		search.click();
		
		String text = driver.findElement(By.xpath("//span[@class='f-bold busFound']")).getText();
		System.out.println("Number of buses : "+text);
		
		driver.findElement(By.xpath("(//input[@id='bt_SLEEPER'])/following::label")).click();
		
		String text2 = driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
		System.out.println("The Second Bus Name is :"+text2);
		
		String title = driver.getTitle();
		System.out.println("The Current URL :"+title);
	}

}
