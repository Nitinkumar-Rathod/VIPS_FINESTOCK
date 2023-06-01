package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom8_Buy_Order {


	@FindBy(xpath="(//section[contains(@class,'MuiContainer')]//a)[1]") private WebElement Buy;

	@FindBy(xpath="(//button[@type='button'])[8]") private WebElement Buy_button1;
	@FindBy(xpath="(//button[@type='button'])[9]") private WebElement Buy_button2;
	@FindBy(xpath="(//button[@type='button'])[10]") private WebElement Buy_button3;




	public pom8_Buy_Order(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_buy() {

		Buy.click();

	}

	public void click_on_buy_order () {


		boolean result1 =Buy_button1.isEnabled();
		boolean result2 =Buy_button2.isEnabled();
		boolean result3 =Buy_button3.isEnabled();


		if (result1==false) {

			Buy_button1.click();

		}
		else if (result2==false) {

			Buy_button2.click();
		}
		else if (result3==true) {

			Buy_button3.click();
		}
		else {

			System.err.println("Not a single seller is available");
		}
	}

}
