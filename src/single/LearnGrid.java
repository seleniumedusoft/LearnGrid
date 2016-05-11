package single;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnGrid {

	String baseurl = "http://newtours.demoaut.com";
	String nodeurl = "http://localhost:4444/wd/hub";

	
	
	
	
	
//	public static void main(String[] args) throws MalformedURLException {
//		
//		LearnGrid gridSamples = new LearnGrid();
//		gridSamples.singleNodeChromeExample();
//
//	}
//	
//	
	
	
	@Test
	public void singleNodeChromeExample(){
		
		
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setVersion("49");
		cap.setPlatform(Platform.WINDOWS);

		try {
			WebDriver driver = new RemoteWebDriver(new URL(nodeurl), cap);
			driver.get(baseurl);
		} catch (Exception e) {

		}

		
	}

	@Test
	public  void singleNodeFFExample() {

		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setVersion("43");
		cap.setPlatform(Platform.WINDOWS);

		try {
			WebDriver driver = new RemoteWebDriver(new URL(nodeurl), cap);
			driver.get(baseurl);
		} catch (Exception e) {

		}

		// WebDriver driver = new FirefoxDriver();
		

	}

}
