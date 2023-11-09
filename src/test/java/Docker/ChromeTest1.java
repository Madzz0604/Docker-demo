package Docker;


import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.*;

public class ChromeTest1 {
	
	@Test
	public void test1() throws MalformedURLException {
		
		
		ChromeOptions browserOptions = new ChromeOptions();
	    URL url = new URL("http://localhost:4444/wd/hub");
	    RemoteWebDriver driver = new RemoteWebDriver(url,browserOptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("The title of the page is : " + driver.getTitle());
		driver.quit();
		
	}
		
	}


