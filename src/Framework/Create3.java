package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configuration.ConfigurationPath;

public class Create3 {

	public static String M1(int row , int coll) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		 Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
		
		 String data = sht.getRow(row).getCell(coll).getStringCellValue();
		
		return data;
		
		
	}
	
}
//""