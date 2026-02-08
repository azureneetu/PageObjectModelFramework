package PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class WebOrdersLogin extends BaseClass {
	

	public WebOrdersLogin() {
        PageFactory.initElements(driver, this);
    }
	
    @FindBy(xpath="//input[@id='ctl00_MainContent_username']")
	private WebElement userNameField ;
    
    @FindBy(xpath="//input[@id='ctl00_MainContent_password']")
    private WebElement passwordField;
    
    @FindBy(id="ctl00_MainContent_login_button")
    private WebElement loginBtn ;
    
    public void enterUsername() {
    	userNameField.sendKeys("Tester");
    	
    }
    
    public void enterPassword() {
    	passwordField.sendKeys("test");
    }
    
    
    
	
    public WebOrders  clickLoginBtn() {
    	enterUsername();
    	enterPassword();
    	loginBtn.click();
    	return new WebOrders();
    	
    	
    }
	
	

}
