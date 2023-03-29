package LearnTestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends LeafTap {
	
	@Test(dataProvider = "Fetch")
	public void cL(String Company, String firstName, String secondName) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(secondName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		
	}

	@DataProvider(name = "Fetch")
  public static String[][] main() throws IOException {
		String[][] readData = ReadTheDataFromExcel.readData();
	
		return readData;
	}

}
