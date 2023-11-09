package Docker;


import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.*;

public class FirefoxTest4 {
	
	@Test
	public void test4() throws MalformedURLException {
		
		 FirefoxOptions browserOptions = new FirefoxOptions();
	     URL url = new URL("http://localhost:4444/wd/hub");
	     RemoteWebDriver driver = new RemoteWebDriver(url,browserOptions);
		
		driver.get("https://www.google.com/");
		
		System.out.println("The title of the page in ff browser: " + driver.getTitle());
		driver.quit();
		
	}
		
	}


