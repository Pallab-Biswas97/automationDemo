package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPageObject {
	public WebDriver driver;

	public SearchPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void searchShoe(String str) throws Throwable {
		String title = driver.getTitle();
		if (title.contains("Amazon")) {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(2000);

		} else {
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys(str);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(2000);
		}
	}

	public void searchMobile(String str) throws Throwable {
		String title = driver.getTitle();
		if (title.contains("Amazon")) {
			driver.findElement(By.id("nav-logo-sprites")).click();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str);
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(2000);
		} else {
			driver.findElement(By.xpath("//*[@title='Flipkart']")).click();
			driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys(str);
			driver.findElement(By.xpath("//*[@title='Search for products, brands and more']")).sendKeys(Keys.RETURN);
//			driver.findElement(By.className("L0Z3Pu")).click();
			Thread.sleep(2000);
		}
	}

	public void searchMovie(String string) {
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(string);
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys(Keys.RETURN);
	}

	public boolean verifyMovieRating(String rating) {
		
		WebElement element = driver.findElement(By.xpath("//span[@class='gsrt KMdzJ'][contains(text(),'10')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		if(element.getText().contains(rating)) {
			return true;
		}
		else {
			return false;
		}
	}
}
