package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Form_Fillup_Test extends BaseDriver {
	static String azure = "https://itera-qa.azurewebsites.net/home/automation";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(azure);
		driver.manage().window().maximize();
		Thread.sleep(5000);// 1000ms=1sec
	}

	@Test(priority = 1)
	public void testLocators() throws InterruptedException {
		WebElement id = driver.findElement(By.id("name"));
		id.sendKeys("Sorefa");
		Thread.sleep(3000);

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("01788888888");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sorefaakter@gmail.com");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("12345678Rubna");
		Thread.sleep(1000);

		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("house no: 156/4");
		Thread.sleep(1000);

		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		// WebElement submitButton=
		// driver.findElement(By.xpath("//button[contains(text(),'Submit')]"));
		// submitButton.click();
		Thread.sleep(5000);
	}
}
