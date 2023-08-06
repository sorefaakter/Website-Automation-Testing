package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDwon_Test_1 extends BaseDriver {

	@Test(priority = 0)
	public void startWebSite() throws InterruptedException {
		driver.get("https://member.daraz.com.bd/user/register");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void DropDown() throws InterruptedException {
		WebElement month = driver.findElement(By.xpath("//span[@id='month']"));
		month.click();
		Thread.sleep(2000);
		WebElement feb = driver.findElement(By.xpath("//li[contains(text(),'February')]"));
		feb.click();
		Thread.sleep(2000);

	}
}
