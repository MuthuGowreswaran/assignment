

package LearnTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="fatchdata")
public class DynamicData {
	
	public void LoginPage(String userName,String password) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	 driver.findElement(By.id("username")).sendKeys(userName);
	 driver.findElement(By.id("password")).sendKeys(password);
     driver.findElement(By.className("decorativeSubmit")).click();

	}
	@DataProvider(name="fatchdata")
	
	//first[] -> mention a row
	//second[]->mention a column
	
	
	public String[][]sendData(){
		
		String[][] data =new String[2][2];
		
		//index start with 0
		//first row
		data[0][0]="demosalesmanager";
		data[0][1]="crmsfa";
		
		//second row
		
		data[1][0]="democrm2";
		data[1][1]="crmsfa";
		
		return data;
		
		
		
	}

}
