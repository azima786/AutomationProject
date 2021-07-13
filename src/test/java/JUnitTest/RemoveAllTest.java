package JUnitTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.RemoveAll;
import util.BrowserFactory;

public class RemoveAllTest {
WebDriver driver;
	
	@Test
	public void ValidateAllcheckboxesareremovedandtoggleAllisSelected() {
	driver = BrowserFactory.init();
	
	RemoveAll All = PageFactory.initElements(driver, RemoveAll.class);
All.ValidatealllistitemcouldberemovedusingremovebuttonandToggleAllon();	

	}
}

