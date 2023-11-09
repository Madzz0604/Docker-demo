package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Setup_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c start_dockergrid.bat");
		Thread.sleep(15000);
	}
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException {
		
		Runtime.getRuntime().exec("cmd /c stop_dockergrid.bat");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");//closes command prompt
	}

}
