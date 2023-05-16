package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3_CreateAd {

	// click on p2p 
	// handle pop_up

	@FindBy(xpath="(//a[contains(@class,'MuiTypography')])[7]") private WebElement P2P;

	@FindBy(xpath="//input[@type='checkbox']") private WebElement Chek_Box;

	@FindBy(xpath="//button[text()='Confirm']") private WebElement confirm;


	public Pom3_CreateAd(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_P2P() {

		P2P.click();

	}
	public void Click_on_check_box () {

		Chek_Box.click();
	}
	public void Click_on_confirm () {

		confirm.click();
	}

}
