package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPagePage {

	public WebDriver driver;
	By username=By.xpath("//input[@id='username']");
	By password=By.xpath("//input[@id='password']");
	By login=By.xpath("//input[@id='Login']");
	By tryforfree=By.xpath("//a[@id='signup_link']");
	public LoginPagePage(WebDriver driver2) {
	this.driver=driver2;
	}

	public WebElement enterusername() {
		return driver.findElement(username);
	}
	
	
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickonlogin() {
		return driver.findElement(login);
	}
	
	public WebElement tryfree() {
		return driver.findElement(tryforfree);
	}
	
}
