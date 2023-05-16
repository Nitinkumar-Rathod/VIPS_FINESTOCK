package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom1 {


	//declere datamember/ global variable with access level public by using @findby annotation 

	@FindBy(xpath="//input[@name='email']") private WebElement UN;

	@FindBy(xpath="//input[@name='password']") private WebElement PSW;

	@FindBy(xpath="//button[@type='submit']") private WebElement loginbtn;

	// initilize in constructor with access level public

	public Login_Pom1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void enter_usr_name(String usrname) {

		UN.sendKeys(usrname);
	}

	public void enter_Pass(String usrname) 
	{
		PSW.sendKeys(usrname);
	}

	public void click_on_login() 
	{
		loginbtn.click();
	}


}
