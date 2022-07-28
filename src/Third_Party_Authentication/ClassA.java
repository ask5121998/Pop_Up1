package Third_Party_Authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in//");
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		
	// sign up
		
		driver.findElement(By.xpath("//div[@id='signin-block']")).click();
		
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		driver.findElement(By.xpath("//iframe[@title='Sign in with Google b  Button']"));
		
		Thread.sleep(5000);
        
		driver.findElement(By.xpath("//span[text()='Sign in with Google']")).click();
		
	}

}
