package keywordsOrAttributes;

import org.testng.annotations.Test;

public class RetryAnalyserTest {

	int i;
	
	@Test(retryAnalyzer = keywordsOrAttributes.RetryAnalyserLogic.class)
	public void getUrl()
	{
		i=9/0;
		System.out.println("OK");
	}
	
}
