package keywordsOrAttributes;

import org.testng.annotations.Test;

public class DependsOnGroupsTest {

//	if we use dependsOnGroups keyword, it means it will execute all test method which declare as group.
	
	
	@Test(groups = "Bajaj")
	public void secondTest()
	{
		System.out.println("This is Bajaj Bike");
	}
	
	@Test(groups = "Honda")
	public void firstTest()
	{
		System.out.println("This is Honda Bike");
	}
	
	@Test(dependsOnGroups = "Bajaj")
	public void thirdTest()
	{
		System.out.println("This is Bajaj Bike");
	}

	
}
