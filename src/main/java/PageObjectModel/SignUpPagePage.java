package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPagePage {
	public WebDriver driver;
	By firstname=By.xpath("//input[@name='UserFirstName']");
	By lastname=By.xpath("//input[@name='UserLastName']");
	By workemail=By.xpath("//input[@name='UserEmail']");
	By jobtitle=By.xpath("//select[@name='UserTitle']");
	By company=By.xpath("//input[@name='CompanyName']");
    By Employess=By.xpath("//select[@name='CompanyEmployees']");
    By phone=By.xpath("//input[@name='UserPhone']");
    By country=By.xpath("//select[@name='CompanyCountry']");
	public SignUpPagePage(WebDriver driver2) {
		this.driver=driver2;
	}
	public WebElement enterfirstname() {
		return driver.findElement(firstname);
	}
		
		public WebElement enterlastname() {
			return driver.findElement(lastname);
		}
			
			public WebElement enteremail() {
				return driver.findElement(workemail);
			}
			
			
			public WebElement selectjobtitle() {
				return driver.findElement(jobtitle);
			}
			
				public WebElement entercompany() {
				return driver.findElement(company);
			}
public WebElement enteremployees() {
	return driver.findElement(Employess);
}
public WebElement enterphone() {
	return driver.findElement(phone);
}
public WebElement enterregion() {
	return driver.findElement(country);
}
}
