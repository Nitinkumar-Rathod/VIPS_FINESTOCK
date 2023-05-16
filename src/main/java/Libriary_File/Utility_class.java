package Libriary_File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility_class {



	public  WebDriver driver;
	public static String get_datafrom_propertyfile(String key) throws IOException 
	{

		FileInputStream file = new FileInputStream("C:\\Users\\91906\\eclipse-workspace\\VIPS_Finestock\\Property_file_login");

		Properties prop = new Properties ();

		prop.load(file);

		String usrname =prop.getProperty(key);

		return usrname;

	}

	public static String getdata_from_excelsheet (int RowIndex, int cellIndex ) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream ("C:\\Users\\91906\\Downloads\\VIPS.xlsx");

		org.apache.poi.ss.usermodel.Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");

		String value2=sh.getRow(RowIndex).getCell(cellIndex).getStringCellValue();

		return value2;
	}






}
