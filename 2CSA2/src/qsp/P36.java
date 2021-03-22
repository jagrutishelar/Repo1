package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class P36 {

public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		
		String path = "./data/Book.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String v = wb.getSheet("Actitime").getRow(0).getCell(0).toString();
		System.out.println(v);//Username
		String w = wb.getSheet("Actitime").getRow(0).getCell(1).toString();
		System.out.println(w);//Password
		
		wb.getSheet("Actitime").getRow(0).getCell(0).setCellValue("MNOP");
		wb.getSheet("Actitime").getRow(0).getCell(1).setCellValue("1234");
		FileOutputStream f1 = new FileOutputStream("./data/Book.xlsx");
		wb.write(f1);
	}

}
