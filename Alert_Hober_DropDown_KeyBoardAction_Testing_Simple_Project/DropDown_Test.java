package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DropDown_Test extends BaseDriver {

	static String azure = "https://itera-qa.azurewebsites.net/home/automation";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(azure);
		driver.manage().window().maximize();
		Thread.sleep(5000);// 1000ms=1sec
	}

	@Test(priority = 1)
	public void DropDown() throws InterruptedException {
		// Female
		WebElement genderFemale = driver.findElement(By.xpath("//input[@id='female']"));
		genderFemale.click();
		Thread.sleep(1000);
		// Tuesday
		WebElement Tuesday = driver.findElement(By.xpath("//input[@id='tuesday']"));
		Tuesday.click();
		Thread.sleep(1000);
		// Friday
		WebElement Friday = driver.findElement(By.xpath("//input[@id='friday']"));
		Friday.click();
		Thread.sleep(3000);

	}

}
