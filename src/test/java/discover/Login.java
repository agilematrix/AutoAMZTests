package discover;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import core.FunctionalFactory;
import core.ListenerFactory;

@Listeners({ ListenerFactory.class })
public class Login extends FunctionalFactory{

	private By field_userName=By.cssSelector("#userid-content");
	private By field_passWord=By.cssSelector("#password-content");
	private By button_login=By.xpath(".//*[@id='log-in-button']");
	private By value_balance=By.xpath(".//*[@id='main-content']/div[2]/div[3]/div/div[2]/strong");
	  
	@Test
	public void login()
	{
		startBrowser("http://www.discover.com");
		enterCredential();
		System.out.println("My Current Balance : " + getText(value_balance));
		closeBrowser();
		
		
	}

	/**
	 * 
	 */
	private void enterCredential() {
		sendKeys(field_userName,"ahotanjal");
		sendKeys(field_passWord,"Chicago312");
		pressEnter();
	
	}

	/**
	 * 
	 */
	private void pressEnter() {
		getDriver().findElement(field_passWord).sendKeys(Keys.RETURN);
	}
}
