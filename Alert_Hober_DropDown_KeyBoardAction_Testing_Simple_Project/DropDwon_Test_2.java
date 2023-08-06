package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDwon_Test_2 extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void DropDown() throws InterruptedException {
		WebElement gender = driver.findElement(By.xpath("//select[@name='sgender']"));
		Select select = new Select(gender);
		select.selectByIndex(2);
		Thread.sleep(2000);
		// select.selectByValue("Not Applicable");
		// Thread.sleep(2000);
		select.selectByVisibleText("Male");
		Thread.sleep(2000);
		select.deselectAll();
		Thread.sleep(2000);
	}
}
