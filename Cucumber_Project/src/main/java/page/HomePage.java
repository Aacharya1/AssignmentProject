package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SetSkyBlueBackgroundButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement SetSkyWhiteBackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement SkyBlueBackgroundcolor;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement SkywhiteBackgroundcolor;

	public void clickSetSkyBlueBackgroundButton() throws InterruptedException {
		Thread.sleep(3000);
		SetSkyBlueBackgroundButton.click();
	}

	public boolean isSetSkyBlueBackgrroundButtonEnabled() {
		return SetSkyBlueBackgroundButton.isEnabled();

	}

	public void clickSetSkyWhiteBackgroundButton() throws InterruptedException {
		Thread.sleep(4000);
		SetSkyWhiteBackgroundButton.click();
	}

	public boolean isSetSkyWhiteBackgrroundButtonEnabled() {
		return SetSkyWhiteBackgroundButton.isEnabled();

	}

	// SkyBlue color validate
	public String getSkyBluePageColor() {
		return SkyBlueBackgroundcolor.getAttribute("style");

	}

	// SkyWhite color validate
	public String getSkyWhitePageColor() {
		return SkywhiteBackgroundcolor.getAttribute("abc");

	}

}
