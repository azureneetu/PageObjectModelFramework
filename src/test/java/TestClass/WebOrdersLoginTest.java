package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageClass.WebOrders;
import PageClass.WebOrdersLogin;


public class WebOrdersLoginTest extends BaseClass {
	
	
	@Test
	public void test() {
		
		WebOrdersLogin WL = new WebOrdersLogin();
		WebOrders WO;
		
		WO = WL.clickLoginBtn();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Web Orders");
		
		
	}

}
