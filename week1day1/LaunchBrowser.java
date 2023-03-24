package week1day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//"webdriver.chrome.driver"
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/alert.xhtml;jsessionid=node01jy6ghei3ytcxlcpujlq9yxsi23365.node0");
}
}
