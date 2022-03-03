package keywordsOrAttributes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderLogic 
{

	public static Object[][] fetchData() throws EncryptedDocumentException, IOException 
	{

		String pathOfFile = "C:\\Users\\Bhushan\\Desktop\\DataP.xlsx";
		FileInputStream fileInput = new FileInputStream(pathOfFile);
		
		Workbook book = WorkbookFactory.create(fileInput);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=0; i<sheet.getLastRowNum(); i++)
		{
			for(int j=0; j<sheet.getRow(0).getLastCellNum(); j++)
			{
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}

}
