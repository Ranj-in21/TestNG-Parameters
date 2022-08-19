package testcase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificationMethod{
	
	@Test(dataProvider = "testdata")

	public void createLead(String username, String password, String companyName, String firstName, String lastName, String primaryPhoneNumber) {
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(primaryPhoneNumber);
		driver.findElement(By.name("submitButton")).click();
		
}

		@DataProvider
		
		public String[][] testdata() {
  
			String[][] data=new String[2][6];
			
			data[0][0]="DemoSalesManager";
			data[0][1]="crmsfa";
			data[0][2]="TestLeaf";
			data[0][3]="Hari";
			data[0][4]="R";
			data[0][5]="99";
   
			data[1][0]="Democsr";
			data[1][1]="crmsfa";
			data[1][2]="Qeagle";
			data[1][3]="Babu";
			data[1][4]="M";
			data[1][5]="97";
			
			return data;
}

}



