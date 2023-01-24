package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By Elements = By.xpath("//*[text()='Elements']");
	
	public WebElement elements() {
		return driver.findElement(Elements);
	}

}
