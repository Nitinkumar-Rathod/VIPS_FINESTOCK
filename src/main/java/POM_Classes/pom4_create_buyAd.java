package POM_Classes;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class pom4_create_buyAd {


	@FindBy(xpath="//a[@href='/p2p/create-ad']") private WebElement CrreateAd;

	@FindBy(xpath="(//div[@role='button'])[1]") private WebElement Dropdown;

	@FindBy(xpath="(//ul[@role='listbox']//li)[1]") private WebElement Buy;

	@FindBy(xpath="(//div[@ROLE='button'])[2]") private WebElement Dropdown_vips;

	@FindBy(xpath="//ul[@role='listbox']//li") private List<WebElement> options;

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
	public void Click_on_vips (String searchText) {

		for (WebElement opt : options) {
			if (opt.getText().contains(searchText))// test class madhun VIPS yeil ithe
			{
				opt.click();
				break;


			}
			}

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
