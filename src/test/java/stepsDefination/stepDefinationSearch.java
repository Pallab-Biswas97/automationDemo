package stepsDefination;

import org.junit.Assert;
import org.junit.runner.RunWith;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.SearchPageObject;
import resources.AutomationBase;

@RunWith(Cucumber.class)
public class stepDefinationSearch extends AutomationBase {
	@Given("Open the webpage")
	public void open_the_webpage() throws Throwable {
		driver = initializeDriver();
	}

	@Then("Go to {string}")
	public void go_to(String string) throws Throwable {
		driver.get(string);
	}

	@Then("Close the browser instances")
	public void close_the_browser_instances() throws Throwable {
		driver.quit();
	}

	@Given("Navigate to {string}")
	public void navigate_to(String string) throws Throwable {
		driver.get(string);
	}

	@Then("Search shoe {string}")
	public void search_shoe(String string) throws Throwable {
		SearchPageObject shoe = new SearchPageObject(driver);
		shoe.searchShoe(string);
	}

	@Then("Search mobile {string}")
	public void search_mobile(String string) throws Throwable {
		SearchPageObject mobile = new SearchPageObject(driver);
		mobile.searchMobile(string);
	}

	@Given("Search the movie {string}")
	public void search_the_movie(String string) throws Throwable {
		SearchPageObject movie = new SearchPageObject(driver);
		movie.searchMovie(string);
	}

	@Then("Verify ratting {double}")
	public void verify_ratting(Double double1) throws Throwable {
		SearchPageObject movie = new SearchPageObject(driver);
		String rating = String.valueOf(double1);
		boolean v = movie.verifyMovieRating(rating);

		try {
			Assert.assertTrue(v);
		} catch (AssertionError e) {
			Assert.assertTrue(false);
		} finally {
			driver.close();
		}
	}
}
