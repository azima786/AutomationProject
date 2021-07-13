package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.AddCategory;
import util.BrowserFactory;

public class Category {
WebDriver driver;
AddCategory AC;

@Test
public void Validateuserisabletoaddcategory() {
	driver = BrowserFactory.init();
	AC = PageFactory.initElements(driver, AddCategory.class);
	AC.ValidateUserTableisAbletoAddCategory();
	AC.ValidateCategorywasadded();
}
}
