package Paramererization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramererization4 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream("C:\\Users\\USER\\Documents\\Parameterization\\Book1.xlsx");
	
	 Sheet sht = WorkbookFactory.create(file).getSheet("sheet1");
	String data = sht.getRow(0).getCell(0).getStringCellValue();
	
	String data1 = sht.getRow(1).getCell(0).getStringCellValue();
	
	String data2 = sht.getRow(2).getCell(0).getStringCellValue();
	
	
	
	
	System.out.println(data);
	
	System.out.println(data1);
	
	System.out.println(data2);
	
	
	}
	
	}
