package Child_Browser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","E:\\Basic\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	// Log in
		WebElement emailField = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		emailField.sendKeys("8600254245");
		WebElement passwardField = driver.findElement(By.xpath("//input[@type='password']"));
		passwardField.sendKeys("8600254245");
		WebElement loginButton = driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]"));  // we use one part"" & next one part ""
		loginButton.click();
		Thread.sleep(2000);
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement searchBox = driver.findElement(By.xpath("//button[@type='submit']"));
		
	// Read data from excel sheet
		
		FileInputStream file = new FileInputStream("E:\\velocity\\Details1.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Sheet1");
		Thread.sleep(2000);
		
		for(int i=0; i<4; i++)
		{
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			inputBox.sendKeys(value);
			searchBox.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='_2kHMtA'])[1]")).click();
			
			for(int j=0; j<value.length(); j++)
			{
				inputBox.sendKeys(Keys.BACK_SPACE);
			}
		}
	// Getting all address of all tabs 
		
		Set<String> addresses = driver.getWindowHandles();
		System.out.println(addresses);
		
		List<String> addressList = new ArrayList<>(addresses);
		
		for(int i=0; i<addressList.size(); i++)
		{
			driver.switchTo().window(addressList.get(i));
			Thread.sleep(2000);
			
			try
			{
				driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			}
			catch(Exception e)
			{
				System.out.println("BUY NOW button not found for address " + addressList.get(i));
			}
		}
	}
}
