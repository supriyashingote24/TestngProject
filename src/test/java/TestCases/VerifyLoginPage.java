package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage;
import Resources.BaseClass;
import Resources.Constants;

public class VerifyLoginPage extends BaseClass {

	@Test(dataProvider="testData")
public void loginverification(String username,String password) throws IOException, InterruptedException {
	

	LoginPagePage obj=new LoginPagePage(driver) ;
	obj.enterusername().sendKeys(username);
	obj.enterpassword().sendKeys(password);
	obj.clickonlogin().click();
	Thread.sleep(5000);
	//obj.tryfree().click();
	String actualtext=driver.findElement(By.xpath("//div[@id='error']")).getText();
	
	String expectedtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
	Assert.assertEquals(actualtext,expectedtext);
	
	
}

@DataProvider
public Object[][] testData(){
	Object[][] data= new Object[2][2];
	data[0][0]=Constants.username1;
	data[0][1]=Constants.password1;
	data[1][0]=Constants.username2;
	data[1][1]=Constants.password2;

	return data;
	
}
		
	}
	
	
	

