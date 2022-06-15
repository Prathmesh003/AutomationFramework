package testngpack;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Demo {
	@Test
	public void a()
	{
		Reporter.log("demo class method",true);
	}
}
