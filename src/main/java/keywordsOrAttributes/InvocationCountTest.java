package keywordsOrAttributes;

import org.testng.annotations.Test;

public class InvocationCountTest {

//  When we have to execute test method multiple times, in this case we will use this keyword.
	
	@Test(invocationCount = 5)
	public void invokeTest()
	{	
		System.out.println("Kundan Bhagat");	
	}
	
}
