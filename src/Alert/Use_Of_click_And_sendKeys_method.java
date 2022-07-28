package Alert;

import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_click_And_sendKeys_method {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		
	// From alert pop-up to insert text
		WebElement clickButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
		clickButton.click();
	    Thread.sleep(2000);
	    
	// Insert data in input field
	    Alert alert = driver.switchTo().alert();
	    alert.sendKeys("Ankita");
	    Thread.sleep(2000);            // click ok button
	    alert.accept();
	    
//	// Use of getText method
//	    alert.getText();
	   
	}
}
