package keywordsOrAttributes;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
	
//	When we are expecting such exception and still want to mark test method as passed.
	
//	If the exception thrown by the test is not part of the user entered list of exceptions, the test will be marked as failed.
//	To make such testcase as passed as we expect the same exception, we will use this attribute
	
	@Test(expectedExceptions = ArithmeticException.class)
	public void excepTion() 
	{
		int i = 9 / 0;
	}
	
	@Test(expectedExceptions = {ArithmeticException.class, ArrayIndexOutOfBoundsException.class})
	public void multiException()
	{
		int n = 9 / 0;
		
		String[] array = new String[2];
		array[0] = "Babu";
		array[1] = "Shyam";
		array[2] = "Raju";
		
		for(int i=0; i<array.length; i++)
		{
			System.out.println(array[i]);
		}
	}

}
