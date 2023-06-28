package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionEquals1 {

	@Test
	public void TC1()
	{
		String actResult="hello";
		String expResult="Hi";
		
		Assert.assertEquals(actResult, expResult,"Failed:both results are diff");
	}
	
}
