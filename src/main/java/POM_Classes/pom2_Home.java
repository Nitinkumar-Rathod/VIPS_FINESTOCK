package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom2_Home {

	@FindBy(xpath="//button[@type='submit']") private WebElement buy ;

	public pom2_Home (WebDriver driver) 

	{
		PageFactory.initElements(driver, this);
	}
	public String get_text () {

		String ActualResult = buy.getText();

		return  ActualResult;

	}












}
