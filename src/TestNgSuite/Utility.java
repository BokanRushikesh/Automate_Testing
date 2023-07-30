package TestNgSuite;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configuration.ConfigurationPath;

public class Utility {

	public static String readExcelData(int row, int col) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream(ConfigurationPath.XLSheetPath);
		
		 Sheet sht = WorkbookFactory.create(f1).getSheet("Sheet1");
		
		String data = sht.getRow(row).getCell(col).getStringCellValue();
		
		return data;
	}

}
