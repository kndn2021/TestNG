package keywordsOrAttributes;

import org.testng.annotations.Test;

public class DependsOnMethodTest {

//  this keyword we will use when our first test method is getting failed and we dont want to run next test method which is totally depend on first method.
	
	@Test(dependsOnMethods = "firstTest")
	public void secondTest()
	{
		System.out.println("This is 2nd Test case");
	}
	
	@Test
	public void firstTest()
	{
		int i = 9/0;
		System.out.println(i);
	}
	
	@Test(dependsOnMethods = "thirdTest")
	public void fourthTest()
	{
		System.out.println("This is 4rth Test case");
	}
	
	@Test
	public void thirdTest()
	{
		System.out.println("This is 3rd Test case");
	}
	
	
	
}
