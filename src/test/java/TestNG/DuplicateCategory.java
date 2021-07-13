package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.ValidateMonthsEntryPage;
import util.BrowserFactory;

public class DuplicateCategory {
	WebDriver driver;
	ValidateMonthsEntryPage DD;

	@Test
	public void ValidateMonths() {
		driver = BrowserFactory.init();
		DD = PageFactory.initElements(driver, ValidateMonthsEntryPage.class);
DD.ValidateMonths();
	}
}
