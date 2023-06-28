package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertTrue1 {

	@Test
	public void TC3()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult,"Failed: actual result is false");
	}
}
