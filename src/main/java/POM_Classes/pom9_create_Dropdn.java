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
	@FindBy(xpath="(//div[@ROLE='button'])[2]") private WebElement Dropdown_vips;

	@FindBy(xpath="(//ul[@role='listbox']//li)[2]") private WebElement VIPS;
	

	public pom9_create_Dropdn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_CrreateAd() {


        // Find all dropdown elements excluding those with the "select" tag name
        List<WebElement> dropdownElements = driver.findElements(By.xpath("(//div[@ROLE='button'])[2])"));

        // Create an ArrayList to store the dropdown values
        ArrayList<String> dropdownValues = new ArrayList<>();

        // Iterate through each dropdown element and extract its value
        for (WebElement dropdown : dropdownElements) {
            String dropdownValue = dropdown.getAttribute("value");
            if (dropdownValue != null && !dropdownValue.isEmpty()) {
                dropdownValues.add(dropdownValue);
            }
        }

        // Print the list of dropdown values
        for (String value : dropdownValues) {
            System.out.println(value);
        }
	      }
		
	
}
