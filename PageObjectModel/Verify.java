package PageObjectModel;

import org.testng.annotations.Test;

import Base.BaseClass;
import pages.Login;

public class Verify extends BaseClass{
	@Test
	public void verifyLead() {
	new Login(driver)
	.enterUsername()
	.enterPassword()
	.clickLogin()
	.verifyHomePage();
	}

}
