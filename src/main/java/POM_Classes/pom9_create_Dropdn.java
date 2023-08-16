package POM_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom9_create_Dropdn {
	
	public WebDriver driver;
	@FindBy(xpath="(//div[@aria-haspopup='listbox'])[2]") private WebElement Dropdown_vips;

	@FindBy(xpath="//ul[@role='listbox']//li") private List<WebElement> options;
	

	public pom9_create_Dropdn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_drp () {
		
		Dropdown_vips.click();
		
	
	}
	
	public void getopt (String searchText) {
		
		for (WebElement opt : options) {
            if (opt.getText().contains(searchText))// test class madhun VIPS yeil ithe
            {
                opt.click();
                break;
		
		
	}
	
		}
	}
		

	
		
	
}
