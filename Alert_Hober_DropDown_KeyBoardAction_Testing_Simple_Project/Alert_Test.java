package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_Test extends BaseDriver {

	static String azure = "https://itera-qa.azurewebsites.net/home/automation";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(azure);
		driver.manage().window().maximize();
		Thread.sleep(5000);// 1000ms=1sec
	}

	@Test(priority = 1)
	public void alertCheck() throws InterruptedException {
		WebElement jsAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement jsConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement jsPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

		jsAlert.click();
		Thread.sleep(2000);
		// String text = driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		String resultText = result.getText();
		if (resultText.contains("You successfully clicked an alert")) {
			// System.out.println("Passed: " + resultText);
		}

		jsConfirm.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		jsPrompt.click();
		driver.switchTo().alert().sendKeys("Hello Alert");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
}
