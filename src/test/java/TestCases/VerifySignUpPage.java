package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPagePage;
import PageObjectModel.SignUpPagePage;
import Resources.BaseClass;
import Resources.Constants;
@Test
public class VerifySignUpPage extends BaseClass{
public void signup() throws IOException, InterruptedException {

	LoginPagePage obj=new LoginPagePage(driver) ;
	obj.tryfree().click();
	SignUpPagePage s=new SignUpPagePage(driver);
	Thread.sleep(5000);
    s.enterfirstname().sendKeys(Constants.firstname);
    s.enterlastname().sendKeys(Constants.lastname);
    s.enteremail().sendKeys(Constants.email);
    s.entercompany().sendKeys(Constants.company);
   
    s.enterphone().sendKeys(Constants.phone);
    Thread.sleep(5000);
    Select sc=new Select(s.selectjobtitle());
    sc.selectByIndex(1);
    Select e=new Select(s.enteremployees());
    e.selectByIndex(1);
    Select r=new Select(s.enterregion());
    r.selectByIndex(4);
   
    
    }
    
    
    
}




