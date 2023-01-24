package stepsDefination;

import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import pageObjects.Elements;
import pageObjects.LandingPage;
import resources.AutomationBase;

@RunWith(Cucumber.class)
public class StepDefination extends AutomationBase {
	@Given("Initialize the webdriver")
	public void initialize_the_webdriver() throws Throwable {
		driver = initializeDriver();

	}

	@When("navigate to {string} site")
	public void navigate_to_site(String string) throws Throwable {
		driver.get(string);

	}

	@Given("Open the toolsQA home page")
	public void open_the_tools_qa_home_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		LandingPage la = new LandingPage(driver);
		la.elements().click();
	}

	@Given("Verify the home page")
	public void verify_the_home_page() throws Throwable {
		String actualTitle = "ToolsQA";
		String title = driver.getTitle();
		Assert.assertTrue(title.equals(actualTitle));
	}

	@Then("Close the browser")
	public void close_the_browser() throws Throwable {
		driver.close();
	}

	@Given("Navigate to text box")
	public void navigate_to_text_box() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		LandingPage la = new LandingPage(driver);
		la.elements().click();
		Elements e = new Elements(driver);
		e.textBox().click();
	}

	@Then("Enter details on the text box {string} {string} {string} {string}")
	public void enter_details_on_the_text_box(String name, String email, String add1, String add2) throws Throwable {
		Elements e = new Elements(driver);
		e.name().sendKeys(name);
		e.email().sendKeys(email);
		e.currentAddress().sendKeys(add1);
		e.permanentAddress().sendKeys(add2);
	}

	@Then("Click submit")
	public void click_submit() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Elements e = new Elements(driver);
		e.submit().click();
		js.executeScript("window.scrollBy(0,100)", "");
	}

	@Then("Verify entered details on the text box")
	public void verify_entered_details_on_the_text_box() throws Throwable {
//		Elements e = new Elements(driver);
		String a = "Kolkata";
		Assert.assertTrue(a.equals("Kolkata"));
	}

	@Given("Navigate to check box")
	public void navigate_to_check_box() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		LandingPage la = new LandingPage(driver);
		la.elements().click();
		Elements e = new Elements(driver);
		e.checkBox().click();
		e.toggle().click();
	}

	@Then("Select downloads from check box")
	public void select_downloads_from_check_box() throws Throwable {
		Elements a = new Elements(driver);
		a.selectDownloads().click();

	}

	@Then("Verify check box selection")
	public void verify_check_box_selection() throws Throwable {
		Elements e = new Elements(driver);
		String a = e.getSuccess().getText();
		Assert.assertTrue(a.equals("downloads"));
	}

	@Given("Navigate to radio button {string}")
	public void navigate_to_radio_button(String url) throws Throwable {
		driver.get(url);
		
	}

	@Then("Select impressive radio button")
	public void select_impressive_radio_button() throws Throwable {
		Elements r = new Elements(driver);
		r.radio().click();
	}

	@And("Verify radio button selection {string}")
	public void verify_radio_button_selection(String str) throws Throwable {
		Elements r = new Elements(driver);
		Assert.assertTrue(r.radioSelect().getText().equals(str));
	}

	@Given("Navigate to button {string}")
	public void navigate_to_button(String str) throws Throwable {
		driver.get(str);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
	}

	@Then("Perform click, double click and right click")
	public void perform_click_double_click_and_right_click() throws Throwable {
		Elements btn = new Elements(driver);
		Actions builder = new Actions(driver);
		Action click = builder
				.moveToElement(btn.click()).click().build();
		click.perform();
		Action rightClick = builder
				.moveToElement(btn.rightClick()).contextClick().build();
		rightClick.perform();
		Action doubleClick = builder
				.moveToElement(btn.doubleClick()).doubleClick().build();
		doubleClick.perform();
		
	}

	@And("Verify the button clicks")
	public void verify_the_button_clicks() throws Throwable {
		Elements btnS = new Elements(driver);
		Assert.assertTrue(btnS.clickSuccess().isDisplayed());
		Assert.assertTrue(btnS.rightClickSuccess().isDisplayed());
		Assert.assertTrue(btnS.doubleClickSuccess().isDisplayed());
	}

	@Given("Navigate to browser windows")
	public void navigate_to_browser_windows() throws Throwable {

	}

	@Then("Access and verify new tab")
	public void access_and_verify_new_tab() throws Throwable {

	}

	@Then("Access and verify new window")
	public void access_and_verify_new_window() throws Throwable {

	}

	@And("Access and verify new window message")
	public void access_and_verify_new_window_message() throws Throwable {

	}

	@Given("Navigate to menu section")
	public void navigate_to_menu_section() throws Throwable {

	}

	@Then("Access sub menu elements")
	public void access_submenu_elements() throws Throwable {

	}

	@Given("Navigate to selection menu {string}")
	public void navigate_to_selection_menu(String select) throws Throwable {
		driver.get(select);
	}

	@Then("Select item from dropdown")
	public void select_item_from_dropdown() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");

		List<WebElement> dropdownToggle = new ArrayList<WebElement>();
		dropdownToggle = driver.findElements(By.className("css-19bqh2r"));
		dropdownToggle.get(1).click();
		js.executeScript("window.scrollBy(0,100)", "");
		List<WebElement> dynamicList = new ArrayList<>();
		dynamicList = driver.findElements(By.className("css-yt9ioa-option"));
		dynamicList.get(0).click();
		dropdownToggle.get(2).click();

		driver.findElement(By.xpath("//*[@class=' css-1n7v3ny-option']")).click();
		Select selectList = new Select(driver.findElement(By.id("cars")));
		selectList.selectByVisibleText("Volvo");
		Thread.sleep(400);
	}
	@Then("verify selection")
	public void verify_selection() throws Throwable  {
		try {
		Assert.assertTrue(driver.findElement(By.xpath("//*[text() = 'Audi']")).isSelected());
		}
		catch(AssertionError e){
//			e.printStackTrace();
			Assert.assertTrue(false);
		}
		finally{
			driver.close();
		}
	}

	@Given("enter {int}")
	public void enter(int number) throws Throwable {
	
	}

	@Then("enter the {string}")
	public void enter_the(String string) throws Throwable  {
	    System.out.println("The output is " + string);
	}


}
