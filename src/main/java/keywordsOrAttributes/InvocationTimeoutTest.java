package keywordsOrAttributes;

import org.testng.annotations.Test;

public class InvocationTimeoutTest {

//  In this method, Test method should take maximum period of time to execute the perticular test method
	
	/*
	 * invocationTimeOut: This is a TestNG attribute that defines the maximum period
	 * of time that a test method with invocationCount should take to execute/invoke
	 * a test method. If the invocationTimeOut has reached before invoking the test
	 * method for invocationCount then an exception (ThreadTimeOutException) will be
	 * thrown.
	 */
	
	@Test(invocationTimeOut = 3000)
	public void invokeTest()
	{	
		int i=1;
		
		while(i==1)
		{
		System.out.println("Kundan Bhagat");	
		}
	}
	
}
