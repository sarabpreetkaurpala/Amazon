package addressModule;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test {
static Workbook book;
static Sheet sheet;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
			
				 FileInputStream file = new FileInputStream ("C:\\Users\\sarab\\eclipse-workspace\\AMAZON\\src\\test\\java\\addressModule\\Data.xlsx");
					
						book = WorkbookFactory.create(file);
						
						sheet = book.getSheet("sheet1");
						
						
						int rowcount = sheet.getLastRowNum();
						int coloumncount = sheet.getRow(0).getLastCellNum();
						
				
					for (int i=0; i<rowcount; i++) {
					for (int k=0; k<coloumncount;k++) {
						String result = sheet.getRow(i+1).getCell(k).toString();
					
					System.out.print(result);
					}
				}
				
				}
	}


