package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom5_CreateAd {

	@FindBy(xpath="((//div[@class='MuiStack-root css-f9n3dw'])[1]//input)[1]") private WebElement click_Amount;

	@FindBy(xpath="((//div[@class='MuiStack-root css-f9n3dw'])[1]//input)[1]") private WebElement Amount;

	@FindBy(xpath="//input[@placeholder='Min amount']") private WebElement click_min_Amount;

	@FindBy(xpath="//input[@placeholder='Min amount']") private WebElement min_Amount;

	@FindBy(xpath="//input[@placeholder='Max amount']") private WebElement click_max_Amount;

	@FindBy(xpath="//input[@placeholder='Max amount']") private WebElement max_Amount;

	@FindBy(xpath="(//button[@type='button'])[7]") private WebElement payment;

	@FindBy(xpath="(//div[@role='button'])[13]") private WebElement Drop_down;

	@FindBy(xpath="(//ul[@role='listbox']//li)[1]") private WebElement payment_method;

	@FindBy(xpath="(//button[@type='button'])[13]") private WebElement Add;

	@FindBy(xpath="//button[@type='submit']") private WebElement Next;


	public Pom5_CreateAd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_amount() {

		click_Amount.click();
	}

	public void Enter_Amount() {

		Amount.sendKeys("10");

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

		max_Amount.sendKeys("742.50");

	}
	public void click_payment_method() {

		payment.click();

	}
	public void click_dropdown() {

		Drop_down.click();		
	}
	public void select_payment_method () {

		payment_method.click();
	}
	public void Add_method () {

		Add.click();

	}
	public void next_click () {

		Next.click();

	}

}
