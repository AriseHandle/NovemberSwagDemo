package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametraization {
	
	public String getExcelData(String sheetname,int row,int cell) throws FileNotFoundException
	{
		FileInputStream file = new FileInputStream("F:\\Arise Java\\Project\\NovemberSwagDemo\\src\\test\\resources\\TestData.xlsx");
		String value = WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellvalue();
		return value;
	}

}
