package Hidden_Division;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	// Log in page up Pop up is best example of hidden division
		
		// log in	
		WebElement emailField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailField.sendKeys("8600254245");
		WebElement passwardField = driver.findElement(By.xpath("//input[@type='password']"));
		passwardField.sendKeys("8600254245");
		WebElement loginButton = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));  // we use one part"" & next one part ""
		loginButton.click();
		
		Thread.sleep(2000);
		
		
	
	}

}
