package pages;

import org.openqa.selenium.By;

public class CartToPlaceOrderPage extends BasePage {

	public By clickCartIcon = By.xpath("//span[@class='cart-icon']");
	public By selectItem = By.xpath("(//label[contains(@class,'next-checkbox cart-item-checkbox')])[2]");
	public By clickProceed = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	public By placeOrder = By.xpath("//button[normalize-space()='Place Order']");

}
