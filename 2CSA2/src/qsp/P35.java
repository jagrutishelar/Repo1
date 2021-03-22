package qsp;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class P35 {

public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = "./data/Book.xlsx";
		
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		
		String v = wb.getSheet("Actitime").getRow(5).getCell(0).toString();
		System.out.println(v);
		
		String w = wb.getSheet("Actitime").getRow(5).getCell(1).toString();
		System.out.println(w);
		
	
	}

}
