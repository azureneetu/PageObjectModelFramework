package TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import PageClass.WebOrders;
import PageClass.WebOrdersLogin;
import PageClass.WebProductPage;

public class WebOrderTest extends BaseClass{
	
	
	@Test
	public void test() {
		
		WebOrdersLogin WL = new WebOrdersLogin();
		WebOrders WO = WL.clickLoginBtn();
		WebProductPage WP = WO.clickProductBtn();
		
		String title = driver.getTitle();
		System.out.println("Title ="+title);
		Assert.assertEquals(title, "Web Orders");
		
	}

}
