package Docker;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.*;

public class EdgeTest5 {
	
	@Test
	public void test5() throws MalformedURLException {
		
		 EdgeOptions browserOptions = new EdgeOptions();
	     URL url = new URL("http://localhost:4444/wd/hub");
	     RemoteWebDriver driver = new RemoteWebDriver(url,browserOptions);
		
		driver.get("https://www.google.com");
		
		System.out.println("The title of the page iin edge driver : " + driver.getTitle());
		driver.quit();
		
	}
		
	}


