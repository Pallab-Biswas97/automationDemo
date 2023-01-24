package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {
	public WebDriver driver;

	public Elements(WebDriver driver) {
		this.driver = driver;
	}

	By textBox = By.xpath("//*[@class='text'][text()='Text Box']");
	By name = By.id("userName");
	By email = By.id("userEmail");
	By currentAddress = By.id("currentAddress");
	By permanentAddress = By.id("permanentAddress");

	By submit = By.xpath("//*[@id='submit'][text()='Submit']");

	By getName = By.xpath("//*[@id='name'][text()='Name:']");
	By getEmail = By.xpath("//*[@id='email'][text()='Email:']");
	By getCurrentAddress = By.xpath("//*[@id='currentAddress'][text()='Current Address :']");
	By getPrmanentAddress = By.id("//*[@id='permanentAddress'][text()='Permananet Address :']");

	By checkBox = By.xpath("//*[@class='text'][text()='Check Box']");
	By toggle = By.xpath("//*[@class='rct-collapse rct-collapse-btn']");
	By selectDownloads = By.xpath("//*[@class='rct-title'][text()='Downloads']");
	By getSuccess = By.xpath("//*[@class='text-success'][text()='downloads']");

	By radio = By.xpath("//*[@for = 'impressiveRadio']");
	By radioSelect = By.xpath("//*[@class = 'text-success'][text()='Impressive']");

	By click = By.xpath("//*[@class='btn btn-primary'][text()='Click Me']");
	By rightClick = By.id("rightClickBtn");
	By doubleClick = By.id("doubleClickBtn");

	By clickSuccess = By.id("dynamicClickMessage");
	By rightClickSuccess = By.id("rightClickMessage");
	By doubleClickSuccess = By.id("doubleClickMessage");

	public WebElement click() {
		return driver.findElement(click);
	}

	public WebElement rightClick() {
		return driver.findElement(rightClick);
	}

	public WebElement doubleClick() {
		return driver.findElement(doubleClick);
	}

	public WebElement clickSuccess() {
		return driver.findElement(clickSuccess);
	}

	public WebElement rightClickSuccess() {
		return driver.findElement(rightClickSuccess);
	}

	public WebElement doubleClickSuccess() {
		return driver.findElement(doubleClickSuccess);
	}

	public WebElement radio() {
		return driver.findElement(radio);
	}

	public WebElement radioSelect() {
		return driver.findElement(radioSelect);
	}

	public WebElement checkBox() {
		return driver.findElement(checkBox);
	}

	public WebElement toggle() {
		return driver.findElement(toggle);
	}

	public WebElement selectDownloads() {
		return driver.findElement(selectDownloads);
	}

	public WebElement getSuccess() {
		return driver.findElement(getSuccess);
	}

	public WebElement submit() {
		return driver.findElement(submit);
	}

	public WebElement textBox() {
		return driver.findElement(textBox);
	}

	public WebElement getName() {
		return driver.findElement(getName);
	}

	public WebElement getEmail() {
		return driver.findElement(getEmail);
	}

	public WebElement getCurrentAddress() {
		return driver.findElement(getCurrentAddress);
	}

	public WebElement permanentAddress() {
		return driver.findElement(permanentAddress);
	}

	public WebElement name() {
		return driver.findElement(name);
	}

	public WebElement email() {
		return driver.findElement(email);
	}

	public WebElement currentAddress() {
		return driver.findElement(currentAddress);
	}

	public WebElement getPrmanentAddress() {
		return driver.findElement(getPrmanentAddress);
	}
}
