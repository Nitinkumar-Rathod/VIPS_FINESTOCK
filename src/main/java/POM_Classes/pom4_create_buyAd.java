package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom4_create_buyAd {


	@FindBy(xpath="//a[@href='/p2p/create-ad']") private WebElement CrreateAd;

	@FindBy(xpath="(//div[@role='button'])[1]") private WebElement Dropdown;

	@FindBy(xpath="(//ul[@role='listbox']//li)[1]") private WebElement Buy;

	@FindBy(xpath="(//div[@ROLE='button'])[2]") private WebElement Dropdown_vips;

	@FindBy(xpath="(//ul[@role='listbox']//li)[3]") private WebElement VIPS;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement clickPrice;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement Price;

	@FindBy(xpath="//button[@type='submit']") private WebElement Next;




	public pom4_create_buyAd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_CrreateAd() {

		CrreateAd.click();

	}
	public void click_on_Dropdown () {

		Dropdown.click();
	}
	public void click_on_buy () {

		Buy.click();
	}
	public void click_on_drpdnvips() {

		Dropdown_vips.click();
	}
	public void click_on_VIPS() {

		VIPS.click();
	}

	public void click_price () {

		clickPrice.click();
	}
	public void enter_price () {

		int min=2;
		int max=3;
		int b= (int)(Math.random()*(max-min)+min);
		Price.sendKeys(Integer.toString(b));

	}
	public void click_on_next () {

		Next.click();
	}


}
