package browserLaunch;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLaunch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium supporting files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
