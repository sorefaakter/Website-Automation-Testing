package pages;

import org.openqa.selenium.By;

public class DeleteAddressPage extends BasePage {

	public By clickEditAddress = By.xpath("(//button[@type='button'][normalize-space()='EDIT'])[2]");
	public By deleteAddress = By.xpath("//span[@class='mod-address-update-delete-btn']");
	public By confirmDeleteAdd = By.xpath("//button[normalize-space()='Delete']");
	public By save = By.xpath("//button[normalize-space()='Save']");

}
