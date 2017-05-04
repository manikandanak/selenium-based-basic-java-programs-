import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
	public static void main(String[] arg) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-2.53.1\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		WebElement lnkRegister = driver.findElement(By.linkText("REGISTER"));
		lnkRegister.click();
		WebElement txtFirstName =driver.findElement(By.name("firstName"));
		txtFirstName.sendKeys("Manikandan");
		WebElement txtLastName =driver.findElement(By.name("lastName"));
		txtLastName.sendKeys("K");
		WebElement txtPhone =driver.findElement(By.name("phone"));
		txtPhone.sendKeys("8870506364");
		WebElement txtEmail =driver.findElement(By.id("userName"));
		txtEmail.sendKeys("manikandanak.it@gmail.com");
	}

}