package keywordsOrAttributes;

import org.testng.annotations.Test;

public class PriorityTest {

//  TestNg runs test method alphabetically. 
//	When we have to run/execute test method in sequencially manner as per our requirements, in this case we will use priority keyword.
	
	@Test(priority = 2)
	public void secondTest()
	{
		System.out.println("This is 2nd Test case");
	}
	
	@Test(priority = 1)
	public void firstTest()
	{
		System.out.println("This is 1st Test case");
	}
	
	@Test(priority = 4)
	public void fourthTest()
	{
		System.out.println("This is 4rth Test case");
	}
	
	@Test(priority = 3)
	public void thirdTest()
	{
		System.out.println("This is 3rd Test case");
	}
	
	
	
}
