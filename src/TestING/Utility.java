package TestING;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configuration.ConfigurationPath;

public class Utility {

	
	public static String readdata(int row ,int coll) throws EncryptedDocumentException, IOException {
		
		FileInputStream File = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		Sheet sht = WorkbookFactory.create(File).getSheet("sheet1");
		
		String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data ;
		
	}
	
	
	
	
	
	
}
//""