package Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_click_And_accept_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	// Use of Click(); & accept(); method
		
	// Opening Alert
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		clickButton.click();
		Thread.sleep(2000);
		
	// Switching to alert pop-up and accept (click on ok)	
		Alert alert = driver.switchTo().alert();   // alert object
		alert.accept();                             // accept method
		Thread.sleep(2000);
		
	}
}
