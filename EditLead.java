package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends ProjectSpecificationMethod {

	@Test(dataProvider = "testdata")
	
	public  void editLead(String UserName, String Password, String PhoneNumber, String CompanyName) throws InterruptedException {
		
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
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(CompanyName);
		driver.findElement(By.name("submitButton")).click();
		
		}
	
	@DataProvider
	
	public String[][] testdata(){
		
		String[][] data = new String[2][4];
		data[0][0] = "DemoSalesManager";
		data[0][1] = "crmsfa";
		data[0][2] = "99";
		data[0][3] = "TCS";
		
		data[1][0] = "Democsr";
		data[1][1] = "crmsfa";		
		data[1][2] = "97";		
		data[1][3] = "CTS";
			
		return data;
				
				
				
		
	}
	
	
	
	
	
}






