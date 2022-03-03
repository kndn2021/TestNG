package keywordsOrAttributes;

import org.testng.annotations.Test;

public class EnableTest {

/*  
  	When we have to execute perticular test method, in this case we will use enabled keyword.
	Here enable = true method will execute and enabled = false method will not be executed.  
*/
	
	@Test(enabled = true)
	public void secondTest()
	{
		System.out.println("This is 2nd Test case");
	}
	
	@Test(enabled = true)
	public void firstTest()
	{
		System.out.println("This is 1st Test case");
	}
	
	@Test(enabled = false)
	public void fourthTest()
	{
		System.out.println("This is 4rth Test case");
	}
	
	@Test(enabled = false)
	public void thirdTest()
	{
		System.out.println("This is 3rd Test case");
	}
	
	
}
