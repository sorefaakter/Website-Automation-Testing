package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoardAction extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void copyPaste() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement name = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

		name.sendKeys("Roshni");
		Thread.sleep(1000);
		email.sendKeys("roshni@gmail.com");
		Thread.sleep(1000);
		currentAddress.sendKeys("house no:1235/A");
		Thread.sleep(1000);
		// select text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// copy text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		// Tab or click
		action.sendKeys(Keys.TAB);
		action.build().perform();
		// permanentAddress.click();
		// paste text
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(5000);

	}
}
