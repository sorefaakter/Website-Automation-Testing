package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alart_Test_Project extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void navigate() throws InterruptedException {
		WebElement JSAlert = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"));
		WebElement JSConfirm = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		WebElement JSPrompt = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
		WebElement result = driver.findElement(By.xpath("//p[@id='result']"));
		JSAlert.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();

		System.out.println(text);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText = result.getText();
		if (resultText.contains("You successfully clicked an alert")) {
			System.out.println("Passed: " + resultText);
		}

		JSConfirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		String resultText1 = result.getText();
		if (resultText1.contains("You clicked: Cancel")) {
			System.out.println("Passed: " + resultText1);
		}

		JSPrompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hi Alarts");
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String resultText2 = result.getText();
		if (resultText2.contains("You entered: Hi Alarts")) {
			System.out.println("Passed: " + resultText2);
		}
		result.click();
	}
}