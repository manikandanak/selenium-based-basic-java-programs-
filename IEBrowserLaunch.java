package browserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserLaunch
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver","C:\\selenium supporting files\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();

	}

}
