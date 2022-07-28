package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	// ankita
	// sanjay
	// kahane
	
	// Use of Click(); & accept(); method
		
	// Opening Alert
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickButton.click();
		Thread.sleep(2000);
		
	// Switching to alert pop-up and accept (click on okay)	
		Alert alert = driver.switchTo().alert();   // alert object
		alert.accept();                             // accept method
		Thread.sleep(2000);
		
	// ============================================
		
	// Opening pop up again
		
		clickButton.click();
		
	// Performing action cancel
		
		Alert alert1 = driver.switchTo().alert();   // alert object
		alert1.dismiss();

	}

}
