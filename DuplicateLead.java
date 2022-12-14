package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends ProjectSpecificationMethod {

		@Test(dataProvider = "testdata")
	
	public void duplicateLead(String UserName, String Password, String PhoneNumber) throws InterruptedException {
		
		driver.findElement(By.id("username")).sendKeys(UserName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();				
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	
}
		@DataProvider
		
		public String[][] testdata(){
			
			String[][] data = new String[2][3];
			
			data[0][0] = "DemoSalesManager";
			data[0][1] = "crmsfa";
			data[0][2] = "99"; 
			
			
			data[1][0] = "Democsr";
			data[1][1] = "crmsfa";
			data[1][2] = "97";
			
			return data;
			
		}
		
		
		
		
		
		
		
		
		
		
}






