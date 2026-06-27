package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class ToLearnFetching {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./TestData/TestScriptData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value1 = wb.getSheet("Testscriptdata.xlsx").getRow(1).getCell(0).getStringCellValue();
	
	
}

}
