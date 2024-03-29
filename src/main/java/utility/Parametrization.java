package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	
	public static String getExcelData(String sheetname,int row,int cell)  
	{
		String value = null;
		try 
		{	
			FileInputStream file = new FileInputStream("C:\\Users\\91877\\OneDrive\\Documents\\NovemberBatch\\SwagDemo\\src\\test\\resources\\TestData.xlsx");
			value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		}
		catch (Exception e) {
			System.out.println("error :- Issue while fetching data");
		}
		return value;
	}

}
