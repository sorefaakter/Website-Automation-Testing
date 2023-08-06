package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Form_FillUp_Test_Project extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void fromFillUp() throws InterruptedException {
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement genderFemale = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		// WebElement
		// dateOFBirth=driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		WebElement subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement reading = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));

		firstName.sendKeys("Roshni");
		Thread.sleep(1000);
		lastName.sendKeys("Meher");
		Thread.sleep(1000);
		email.sendKeys("roshni@gmail.com");
		Thread.sleep(1000);
		genderFemale.click();
		Thread.sleep(1000);
		mobile.sendKeys("01712345678");
		Thread.sleep(1000);
		// dateOFBirth.sendKeys("12 Jan 2025");
		// Thread.sleep(3000);
		subject.sendKeys("Automation");
		Thread.sleep(1000);
		address.sendKeys("house no:1235/A");
		Thread.sleep(1000);
		reading.click();
		Thread.sleep(3000);

	}
}
