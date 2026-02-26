package PageClass;

import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class WebProductPage extends BaseClass{
	
	public WebProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	

}
