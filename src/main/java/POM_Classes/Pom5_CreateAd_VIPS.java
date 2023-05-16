package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5_CreateAd_VIPS {

	@FindBy(xpath="((//div[@class='MuiStack-root css-f9n3dw'])[1]//input)[1]") private WebElement click_Amount;

	@FindBy(xpath="((//div[@class='MuiStack-root css-f9n3dw'])[1]//input)[1]") private WebElement Amount;

	@FindBy(xpath="//input[@placeholder='Min amount']") private WebElement click_min_Amount;

	@FindBy(xpath="//input[@placeholder='Min amount']") private WebElement min_Amount;

	@FindBy(xpath="//input[@placeholder='Max amount']") private WebElement click_max_Amount;

	@FindBy(xpath="//input[@placeholder='Max amount']") private WebElement max_Amount;


	public Pom5_CreateAd_VIPS(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_amount() {

		click_Amount.click();
	}

	public void Enter_Amount() {

		Amount.sendKeys("100");

	}
	public void click_on_min_amount() {

		click_min_Amount.click();
	}
	public void Enter_minAmount() {

		min_Amount.sendKeys("100");

	}
	public void click_on_max_amount() {

		click_max_Amount.click();
	}
	public void Enter_MaxAmount() {

		max_Amount.sendKeys("247.50");

	}

}
