package keywordsOrAttributes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		
		Object[][] gotData = DataProviderLogic.fetchData();
		return gotData;
	}
	
	@Test(dataProvider = "getData")
	public void dataReceived(String usn, String pwd)
	{
		System.out.println("Username is : " +usn);
		System.out.println("Password is : " +pwd);
	}
	
}
