package browserLaunch;

import org.openqa.selenium.edge.EdgeDriver;


public class MicrosoftEdgeBrowser 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","C:\\selenium supporting files\\MicrosoftWebDriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
