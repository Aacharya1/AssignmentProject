package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.HomePage;
import util.BrowserFactory;

public class BackgroundColorSteps {
	WebDriver driver;
	HomePage homepage;

	@Before
	public void startFirst() {
		driver = BrowserFactory.startBrowser();
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Given("^Set SkyBlue Background button exists;$")
	public void set_SkyBlue_Background_button_exists() throws Throwable {
		Assert.assertTrue("Sky Blue Background does not exit", homepage.isSetSkyBlueBackgrroundButtonEnabled());
		//Assert.assertTrue("Sky Blue Background does not exit", homepage.isSetSkyBlueBackgrroundButtonEnabled());
		
	}
	@When("^I click on the button;$")
	public void i_click_on_the_button() throws Throwable {
		// throw new PendingException();
		homepage.clickSetSkyBlueBackgroundButton();
	}

	@Then("^the background color will change to sky blue;$")
	public void the_background_color_will_change_to_sky_blue() throws Throwable {
		System.out.println("Background color is changed to blue" + homepage.getSkyBluePageColor());
	}

	@Given("^Set SkyWhite Background button exists;$")
	public void set_SkyWhite_Background_button_exists() throws Throwable {
	Assert.assertTrue("Sky White Background does not exit", homepage.isSetSkyWhiteBackgrroundButtonEnabled());	
   //assertTrue("Sky White Background does not exit" +homepage.isSetSkyWhiteBackgrroundButtonEnabled());
	}

	@When("^click on the button;$")
	public void click_on_the_button() throws Throwable {
		homepage.clickSetSkyWhiteBackgroundButton();

	}

	@Then("^the background color will change to sky white;$")
	public void the_background_color_will_change_to_sky_white() throws Throwable {
		System.out.println("Background color is changed to white" + homepage.getSkyWhitePageColor());
	}

	@After
	public void close() throws InterruptedException {
		driver.close();
		driver.quit();
	}
}
