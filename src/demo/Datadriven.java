package demo;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// path of the excel sheet
		FileInputStream f = new FileInputStream("./Excel/excelsheet.xlsx");

		Workbook wb = WorkbookFactory.create(f);
		String b = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

		System.out.println(b);
	}

}
