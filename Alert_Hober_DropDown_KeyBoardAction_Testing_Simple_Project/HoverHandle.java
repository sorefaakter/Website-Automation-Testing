package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverHandle extends BaseDriver {
	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void hoverTest() throws InterruptedException {
		Actions action = new Actions(driver);

		WebElement electronic = driver.findElement(By.xpath("//span[contains(text(),'Electronic Accessories')]"));
		WebElement Mobile = driver.findElement(By.xpath("//span[text()='Mobile Accessories']"));
		WebElement Phone = driver.findElement(By.xpath("//span[contains(text(),'Phone Cases')]"));

		action.moveToElement(electronic).perform();
		Thread.sleep(1000);
		action.moveToElement(Mobile).perform();
		Thread.sleep(1000);
		// action.moveToElement(Access).perform();
		Phone.click();
		Thread.sleep(3000);

	}
}
