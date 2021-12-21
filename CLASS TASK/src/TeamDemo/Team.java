package TeamDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Team {
	WebDriver driver;
	
	@Test
	public void WaitConcept()
	{
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	}
}
