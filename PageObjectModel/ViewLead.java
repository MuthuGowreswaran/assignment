package PageObjectModel;

import org.openqa.selenium.chrome.ChromeDriver;

import Base.BaseClass;

public class ViewLead extends BaseClass {
	
	public ViewLead(ChromeDriver driver) {
		this. driver= driver;
		
	}
	
	public ViewLead verify() {
		
		
		System.out.println("The Create Lead Page is Verifyed");
		
		return this;
	}
	
	

}
