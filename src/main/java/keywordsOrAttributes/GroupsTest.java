package keywordsOrAttributes;

import org.testng.annotations.Test;

public class GroupsTest {

//  When we have to declare test methods group wise, in this case we will use groups keyword.
//	It will display tests group-wise after execution in Reports.
	
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
	
	@Test(groups = "KTM")
	public void fourthTest()
	{
		System.out.println("This is KTM Bike");
	}
	
	@Test(groups = "Bajaj")
	public void thirdTest()
	{
		System.out.println("This is Bajaj Bike");
	}
	
}
