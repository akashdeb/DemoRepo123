package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/ExcelData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String customerName = cell.getStringCellValue();
		System.out.println("Customer Name : "+customerName);
		
		String projectName = row.getCell(1).toString();
		System.out.println("The project is : "+projectName);
		
		boolean status = row.getCell(3).getBooleanCellValue();
		System.out.println("The Status is : "+status);
		
		double phnNo = row.getCell(2).getNumericCellValue();
		System.out.println("Phone No is : "+phnNo);
		System.out.println("=========================================================");
		System.out.println("Customer 2 is : "+sheet.getRow(3).getCell(0).toString());
	}

}