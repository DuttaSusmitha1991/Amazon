package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

public class DataUtility {

	public static String UserName;
    public static String Password;
	//public static String IncorrectUN;
	
	
	
	
	public void fetch_data() throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\dsusm\\eclipse-workspace\\Amazon\\ExcelSheet\\Amazon_Credentials.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		UserName =NumberToTextConverter.toText(w1.getSheet("Login").getRow(1).getCell(0).getNumericCellValue());
		Password = w1.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		//IncorrectUN = NumberToTextConverter.toText(w1.getSheet("Login").getRow(2).getCell(1).getNumericCellValue());
	}


}
