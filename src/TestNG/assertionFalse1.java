package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionFalse1 {

	@Test
	public void TC4()
	{
		boolean actResult=true;
		
		Assert.assertFalse(actResult,"Failed: actual result is true");
	}
}
