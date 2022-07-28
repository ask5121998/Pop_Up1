package Normal_Authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String username = "admin";
	    String passward = "admin";
	    
	    String newUrl = "https://"+username+":"+passward+"@"+"the-internet.herokuapp.com/basic_auth";
		
		driver.get(newUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

}
