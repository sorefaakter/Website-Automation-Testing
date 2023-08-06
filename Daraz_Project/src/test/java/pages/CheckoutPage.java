package pages;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

	public By searchBtn = By.xpath("//input[@id='q']");
	public By selectProduct = By.xpath("//a[contains(text(),'Outdoor Travel Mini Bagpack 10L')]");
	public By addToCart = By.xpath("//span[contains(text(),'Add to Cart')]");
	public By goToCartBtn = By.xpath("//button[normalize-space()='GO TO CART']");

	public void doCheckout(String product) {

		clickOnElement(searchBtn);
		write(searchBtn, product);
		enter(searchBtn);
		clickOnElement(selectProduct);
		clickOnElement(addToCart);
		clickOnElement(goToCartBtn);
	}
}
