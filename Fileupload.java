package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///D:/QATraining/TestingCourses/Selenium/AutoIT/fileupload.html");
		
		driver.findElement(By.xpath(".//input[@id='1']")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\QATraining\\TestingCourses\\Selenium\\AutoIT\\fileuploada3.exe");
		
	}

}
