package Test_Class;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libriary_File.Base_class;
import POM_Classes.Login_Pom1;
import POM_Classes.Pom3_CreateAd;
import POM_Classes.Pom5_CreateAd;
import POM_Classes.Pom5_CreateAd_VIPS;
import POM_Classes.pom2_Home;
import POM_Classes.pom4_create_buyAd;
import POM_Classes.pom6_createad;
import POM_Classes.pom7_create_bye_Ad;
import POM_Classes.pom8_Buy_Order;

public class Test_class5_Buy_order extends Base_class

{
	
	
	// create object  logger class
		Logger logger = (Logger) LogManager.getLogger("Test_class5_Buy_order");

		public Login_Pom1 loginp1 ;
		public pom2_Home  Homep2;
		public Pom3_CreateAd CretAd ;
		public pom4_create_buyAd clickCretAd;
		public pom8_Buy_Order Buy_order;


		@BeforeClass
		public void open_browser(ITestContext Context) throws InterruptedException {

			initilize_browser (Context);
			logger.info("Brouser opened sucessfully...!");

			loginp1 = new Login_Pom1 (driver);

			Homep2 = new pom2_Home (driver);

			CretAd =new Pom3_CreateAd (driver);

			clickCretAd =new pom4_create_buyAd (driver);

			Buy_order =new pom8_Buy_Order (driver);



		}

		@BeforeMethod
		public void Login () throws IOException {

			loginp1.enter_usr_name(Libriary_File.Utility_class.get_datafrom_propertyfile("UN"));
			logger.info("Entered Username....!");

			loginp1.enter_Pass(Libriary_File.Utility_class.get_datafrom_propertyfile("PSW"));
			logger.info("Entered Passward....!");

			loginp1.click_on_login();
			logger.info("Login sucessful....!");

		}
	
		@Test (testName="Complet_Buy_Order")
		public void Complet_Buy_Order() throws InterruptedException, EncryptedDocumentException, IOException {

			try {

				CretAd.click_on_P2P();
				extentTest.info("Click on P2P");
				logger.info("Click on p2p...!");
				Thread.sleep(8000);
				
				CretAd.Click_on_check_box();
				Thread.sleep(3000);

				CretAd.Click_on_confirm();
				extentTest.info("select check box and click on confirm");
				logger.info("select check box and click on confirm....!");
				Thread.sleep(5000);

				Buy_order.click_on_buy();
				extentTest.info("click on buy button");
				logger.info("click on buy button sucessfully....!");
				Thread.sleep(5000);

				Buy_order.click_on_buy_order();
				extentTest.info("select buy order");
				logger.info("buy order select sucessfully....!");
				
			}

			catch(Exception Xyz) {

				Xyz.getStackTrace();
				String getcause = Xyz.getLocalizedMessage();
				System.out.println("issue cause is:-"+getcause);
				extentTest.fail("Create_VIPS_Buy_Ad test case is fail due to"+getcause);
			}

		}
		/*
			@AfterMethod
			public void logout() throws InterruptedException{

				Thread.sleep(3000);

				pom6_cretad.logout_VIPS(driver);

			}
			@AfterClass
			public void Close_browser(){

				driver.close();

			}*/
	
	

}
