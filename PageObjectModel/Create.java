package PageObjectModel;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.CreateLead;
import pages.Login;
import pages.Home;

public class Create extends BaseClass{
	
	@Test
	public void runCreateLead()
	{
		
		new Login(driver)
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickCrmsfa()
		.clickLead()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreate()
		.verify();
	}
	

}
