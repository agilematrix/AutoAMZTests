package www.officedepot.com;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import core.FunctionalFactory;
import core.ListenerFactory;
import junit.framework.Assert;



@Listeners({ ListenerFactory.class })
public class HomePage extends FunctionalFactory {

	@ Test (invocationCount = 1 , threadPoolSize = 2)
	
	public void test()
	{
		startBrowser("http://www.google.com");
Assert.assertEquals(getTitle(), "savds");

		closeBrowser();	

	}
}
