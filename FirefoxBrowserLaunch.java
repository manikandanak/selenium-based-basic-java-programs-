package browserLaunch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunch
{

	public static void main(String[] args) 
	{
		//To open firefox browser we need driver named as geckodriver.exe
		//System.setProperty("webdriver.gecko.driver","C:/selenium supporting files/geckodriver-v0.16.1-win32/geckodriver.exe");
		//Pre request for selenium
		//org.openqa.selenium.firefox.FirefoxDriver driver = new org.openqa.selenium.firefox.FirefoxDriver(); //Firefox Browser open
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");  //passing url to the address bar
		
		driver.manage().window().maximize(); //Maximizing the browse window
		
		//Business functionality
		
		//post request
		driver.close();
		
	}

}
