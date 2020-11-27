package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.GoogleSearchPage;
import Pages.HomePage;
import Pages.SearchResultsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HomePageSteps {
	
	WebDriver driver=null;
	GoogleSearchPage search;
	SearchResultsPage results;
	HomePage home;
	
	@After
	public void close_browser_at_the_end()
	{
		driver.close();
	}
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/server/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://google.com");
	}

	@When("^user enters (.*) in Search Box and hits enter$")
	public void user_enters_in_search_box_and_hits_enter(String text) {
		search=new GoogleSearchPage(driver);
		search.enterSearchText(text);
		search.clickEnter();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@And("user clicks the first result returned by google")
	public void user_clicks_the_first_result_returned_by_google() {
		results=new SearchResultsPage(driver);
		results.clickFirstLink();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Then("check J. P. Morgan logo availability in the homepage")
	public void check_j_p_morgan_logo_availability_in_the_homepage() {
		home=new HomePage(driver);
		home.logoIsDisplayed();
	}
}
