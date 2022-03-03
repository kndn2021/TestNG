package keywordsOrAttributes;

import org.testng.annotations.Test;

public class AlwaysRunTest {

//	In dependsOnMethods keyword, if our 1st test method getting failed, then it will skipped 2nd test method.
//	But somethimes we have to execute 2nd test method as well, in this case we will use alwaysRun keyword.
	
	@Test(dependsOnMethods = "firstTest", alwaysRun = true)
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
	
	@Test(dependsOnMethods = "thirdTest", alwaysRun = true)
	public void fourthTest()
	{
		System.out.println("This is 4rth Test case");
	}
	
	@Test
	public void thirdTest()
	{
		int j = 9/0;
		System.out.println("This is 3rd Test case");
	}
	
}
