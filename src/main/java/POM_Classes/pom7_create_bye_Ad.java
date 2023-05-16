package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom7_create_bye_Ad {


	@FindBy(xpath="(//a[contains(@class,'MuiButtonBase')])[6]") private WebElement CrreateAd;

	@FindBy(xpath="(//div[@role='button'])[1]") private WebElement Dropdown;

	@FindBy(xpath="(//ul[@role='listbox']//li)[1]") private WebElement Buy;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement clickPrice;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement Price;

	@FindBy(xpath="//button[@type='submit']") private WebElement Next;




	public pom7_create_bye_Ad(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_CrreateAd() {

		CrreateAd.click();

	}
	public void dropdn () {

		Dropdown.click();
	}
	public void click_on_buy () {

		Buy.click();

	}
	public void click_price () {

		clickPrice.click();
	}
	public void enter_price () {

		Price.sendKeys("75");
	}
	public void click_on_next () {

		Next.click();
	}






}
