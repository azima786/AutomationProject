package JUnitTest;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pages.Checkbox;
import pages.RemoveButton;
import util.BrowserFactory;

public class checkboxandremovebutton {
WebDriver driver;
	
	@Test
	public void ValidateWhenToggleBoxIsCheckedAllBoxesForListItemsIsAlsoChecked() throws Exception {
	driver = BrowserFactory.init();
	
	Checkbox mainpage = PageFactory.initElements(driver, Checkbox.class);
	mainpage.ClickonToggleAll();
	mainpage.ConfirmCheckBoxesareselected();

	RemoveButton RB = PageFactory.initElements(driver, RemoveButton.class);
	RB.ValidateThatSingleItemCouldBeRemovedUsingRemoveButtonWhenSingleCheckboxIsSelected();
	
	BrowserFactory.teardown();

	}
}
