package keywordsOrAttributes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	@Parameters({ "url", "username", "password" })
	@Test
	public void setUp(String URL, String username, String password) {
		System.out.println(URL);
		System.out.println(username);
		System.out.println(password);
	}

}
