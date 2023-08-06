package com.bd.WebAutomation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Test_Project extends BaseDriver {

	static String azure = "https://itera-qa.azurewebsites.net/home/automation";

	@Test(priority = 0)
	public void openUrl() throws InterruptedException {
		driver.get(azure);
		driver.manage().window().maximize();
		Thread.sleep(5000);// 1000ms=1sec
	}

	@Test(priority = 1)
	public void dropDown() throws InterruptedException {
		WebElement country = driver.findElement(By.xpath("//body/div[1]/div[4]/div[2]/div[1]/select[1]"));
		Select select = new Select(country);
		select.selectByIndex(1);
		Thread.sleep(5000);
	}
}
