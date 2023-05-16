package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom6_createad {



	@FindBy(xpath="//textarea[@placeholder='Remarks']") private WebElement Click_Remark;

	@FindBy(xpath="//textarea[@placeholder='Remarks']") private WebElement Enter_Remark;

	@FindBy(xpath="//button[@type='submit']") private WebElement Next;

	@FindBy(xpath="(//button[@type='submit'])[2]") private WebElement Confirm;
	
	@FindBy(xpath="//button[@type='submit']") private WebElement CreateBuyAd;

	@FindBy(xpath="(//section[contains(@class,'MuiContainer')]//h3)[1]") private WebElement Myad;

	@FindBy(xpath="((//div[@class='MuiBox-root css-16cr4kz'])[2]//div)[5]") private WebElement Profile;

	@FindBy(xpath="//div[@class='MuiBox-root css-bw6t70']") private WebElement Logut;




	public pom6_createad(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	// utilize within method

	public void click_on_remark() {

		Click_Remark.click();
	}

	public void Enter_in_remark() {

		Enter_Remark.sendKeys("hjdfhl");
	}
	public void Next_Remark() {

		Next.click();
	}
	public void Click_on_confirm() {

		Confirm.click();
	}
	public void create_buy_ad () {
		
		CreateBuyAd.click();
	}
	public String My_Ad_text() {

		String ActualResult = Myad.getText();

		return  ActualResult;
	}
	public void logout_VIPS (WebDriver driver) throws InterruptedException {

		Actions act= new Actions (driver);

		act.moveToElement(Profile).perform();

		Thread.sleep(3000);

		Logut.click();

		/*WebElement profile =driver.findElement(By.xpath("((//div[@class='MuiBox-root css-16cr4kz'])[2]//div)[5]"));

			// step 2 create object of actions class 

			Actions  act = new Actions (driver);

			// step3 call the method 

			Thread.sleep(5000);

			act.moveToElement(profile).perform();*/

	}


}
