package Test_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Libriary_File.Base_class;
import Libriary_File.Utility_class;
import Libriary_File.hkbnkd;
import POM_Classes.Login_Pom1;
import POM_Classes.Pom3_CreateAd;
import POM_Classes.Pom4_CreateAd;
import POM_Classes.Pom5_CreateAd;
import POM_Classes.pom2_Home;
import POM_Classes.pom4_create_buyAd;
import POM_Classes.pom6_createad;
import POM_Classes.pom7_create_bye_Ad;

public class Test_class2 extends Base_class

{
	

	public Login_Pom1 loginp1 ;
	public pom2_Home  Homep2;
	public Pom3_CreateAd CretAd ;
	public pom4_create_buyAd clickCretAd_buy;
	public Pom4_CreateAd clickCretAd;
	public Pom5_CreateAd pom5_cretad;
	public pom6_createad pom6_cretad;
	public pom7_create_bye_Ad pom7_cretad;


	@BeforeClass
	public void open_browser(ITestContext Context) throws InterruptedException {

		initilize_browser (Context);

		loginp1 = new Login_Pom1 (driver);

		Homep2 = new pom2_Home (driver);

		CretAd =new Pom3_CreateAd (driver);

		clickCretAd_buy =new pom4_create_buyAd (driver);

		clickCretAd =new Pom4_CreateAd (driver);

		pom5_cretad =new Pom5_CreateAd (driver);

		pom6_cretad =new pom6_createad (driver);

		pom7_cretad =new pom7_create_bye_Ad (driver);


	}

	@BeforeMethod
	public void Login () throws IOException {

		loginp1.enter_usr_name(Libriary_File.Utility_class.get_datafrom_propertyfile("UN"));

		loginp1.enter_Pass(Libriary_File.Utility_class.get_datafrom_propertyfile("PSW"));

		loginp1.click_on_login();

	}
	/*
	@Test 
	public void Login1() throws EncryptedDocumentException, IOException, InterruptedException {

		ExtentTest test = extent.createTest("Login in to Application").assignAuthor("Nitin")
				.assignCategory("Sanity").assignDevice("Chrome");

		test.log(Status.PASS, "User login sucessfully");

		// or we can use 

		test.pass("User login sucessfully");

		Thread.sleep(10000);

      String ActualResult =Homep2.get_text();

		System.out.println(ActualResult);


		String Expected_Result=Utility_class.getdata_from_excelsheet(0, 0);


		AssertJUnit.assertEquals(ActualResult, Expected_Result);

		Thread.sleep(30000);

	}
	 */
	@Test (testName="Create_BUY_Ad")
	public void Create_BUY_Ad() throws InterruptedException, EncryptedDocumentException, IOException {

		try {
		CretAd.click_on_P2P();
		extentTest.info("click on P2P");
		Thread.sleep(8000);

		CretAd.Click_on_check_box();
		Thread.sleep(5000);

		CretAd.Click_on_confirm();
		extentTest.info("click on confirm");
		Thread.sleep(1000);

		clickCretAd.click_on_CrreateAd();
		extentTest.info("click on create ad");
		//Thread.sleep(2000);

		clickCretAd_buy.click_on_Dropdown();
		//Thread.sleep(2000);

		clickCretAd_buy.click_on_buy();
		extentTest.info("click on Buy");
		//Thread.sleep(2000);

		clickCretAd.click_price();
		//Thread.sleep(2000);

		clickCretAd.enter_price();
		extentTest.info("Entered price");
		//Thread.sleep(2000);

		clickCretAd.click_on_next();
		extentTest.info("click on Next");
		//Thread.sleep(3000);
		
		pom5_cretad.click_amount();
		//Thread.sleep(3000);

		pom5_cretad.Enter_Amount();
		extentTest.info("Entered price");
		//Thread.sleep(2000);

		pom5_cretad.click_on_min_amount();
		//Thread.sleep(2000);

		pom5_cretad.Enter_minAmount();
		extentTest.info("Entered Minimum price");
		//Thread.sleep(2000);

		pom5_cretad.click_on_max_amount();
		//Thread.sleep(2000);

		pom5_cretad.Enter_MaxAmount();
		extentTest.info("Entered Maaximum price");
		//Thread.sleep(2000);

		pom5_cretad.click_payment_method();
		//Thread.sleep(2000);

		pom5_cretad.click_dropdown();
		Thread.sleep(2000);

		pom5_cretad.select_payment_method();
		Thread.sleep(1000);

		pom5_cretad.Add_method();
		extentTest.info("Add payment Method");
		//Thread.sleep(3000);

		pom5_cretad.next_click();
		extentTest.info("Click on next");
		Thread.sleep(2000);

		pom6_cretad.click_on_remark();
		//Thread.sleep(2000);

		pom6_cretad.Enter_in_remark();
		extentTest.info("Entered Remark");
		//Thread.sleep(2000);

		pom6_cretad.create_buy_ad();
		extentTest.info("click on create Ad button");
		Thread.sleep(1000);
		}
		catch(Exception Xyz) {
			
			Xyz.getStackTrace();
			String getcause = Xyz.getLocalizedMessage();
			System.out.println("issue cause is:-"+getcause);
			extentTest.fail("Create_VIPS_Buy_Ad test case is fail due to"+getcause);
		}
		
		String  ActualResult=driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 css-7i2tvn']")).getText();
		String ExpectedResult="Add Created Successfully";
		Assert.assertEquals(ActualResult, ExpectedResult);

		

	}
   /*
	@AfterMethod
	public void logout() throws InterruptedException{

		Thread.sleep(5000);

		pom6_cretad.logout_VIPS(driver);

	}
	@AfterClass
	public void Close_browser(){

		driver.close();
	}*/
}
