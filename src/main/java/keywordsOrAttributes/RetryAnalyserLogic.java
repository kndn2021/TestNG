package keywordsOrAttributes;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserLogic implements IRetryAnalyzer{

	int counter = 1;
	int retry = 3;
	

	public boolean retry(ITestResult result) {

		if(counter < retry)
		{
			counter ++;
			return true;
		}
		return false;
	}
	
}
