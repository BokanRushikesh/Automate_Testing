package Paramererization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Configuration.ConfigurationPath;

public class ParamererizationPractice {
     public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    	    FileInputStream file = new FileInputStream(ConfigurationPath.XLSheetPath);
    	    
    	String sts = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
    	 
    	 
    	 System.out.println(sts);
    	 
    	 
	}
	
	
}
