package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ABC {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// Object creation for path
		FileInputStream file = new FileInputStream("C:\\Users\\USER\\Documents\\Parameterization\\Book1.xlsx");
		
		// read data
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);

		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}