package PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class WebOrders extends BaseClass {
	
	public WebOrders() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='View all products']")
	private WebElement  viewProductBtn;
	
	public WebProductPage clickProductBtn() {
		viewProductBtn.click();
		return new WebProductPage();
	}

}
