package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverSetup.getDriver;

import java.time.Duration;

public class BasePage {

	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);

	}

	public void clickOnElement(By locator) {
		// getElement(locator).click();
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();

	}

	public String getElementText(By locator) {
		return getElement(locator).getText();

	}

	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView()", element);

	}

	public void write(By locator, String text) {
		getElement(locator).sendKeys(text);
	}

	public void waitForElementVisiable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void enter(By locator) {
		getElement(locator).sendKeys(Keys.RETURN);
	}

	public void select(By locator, String optionText) {
		WebElement dropdown = getElement(locator);
		Select select = new Select(dropdown);
		select.selectByVisibleText(optionText);
	}
}
