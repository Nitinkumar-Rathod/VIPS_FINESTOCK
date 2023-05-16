package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4_CreateAd {

	@FindBy(xpath="//a[@href='/p2p/create-ad']") private WebElement CrreateAd;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement clickPrice;

	@FindBy(xpath="(//div[@class='MuiStack-root css-djkqj9']//input)[4]") private WebElement Price;

	@FindBy(xpath="//button[@type='submit']") private WebElement Next;




	public Pom4_CreateAd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_CrreateAd() {

		CrreateAd.click();

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
