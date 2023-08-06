package pages;

import org.openqa.selenium.By;

public class AddDeliveryAddressPage extends BasePage {

	public By myAccount = By.id("myAccountTrigger");
	public By manageMyAcc = By.xpath("//a[normalize-space()='Manage My Account']");
	public By clickEdit = By.xpath("(//a[normalize-space()='EDIT'])[2]");
	public By addNewAddress = By.xpath("//span[@class='mod-address-book-ft-content']");
	public By fullName = By.xpath("//input[@placeholder='Input full name']");
	public By mobileNumber = By.xpath("//input[@placeholder='Input mobile number']");
	public By country = By.xpath("//span[contains(text(),'Please choose your province')]");
	public By selectCounty = By.id("R3921322");
	public By city = By.xpath("//span[contains(text(),'Please choose your city/municipality')]");
	public By selectCity = By.id("R80300579");
	public By area = By.xpath("//span[contains(text(),'Please choose your area')]");
	public By selectArea = By.id("RBD314");
	public By address = By.xpath("//input[@placeholder='House no. / building / street / area']");
	public By selectdeliveryLable = By.xpath("(//span[contains(text(),'Home')])[5]");
	public By save = By.xpath("//button[normalize-space()='Save']");

	public void addAddress(String deliveryAddress) {
		write(fullName, deliveryAddress);
		write(mobileNumber, "01711111110");
		write(address, "House No-188, 5th floor, Paltan Road");
	}
}
