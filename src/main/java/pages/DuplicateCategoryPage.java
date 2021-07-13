package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DuplicateCategoryPage extends BasePage {
WebDriver driver;
String value = "Test";
String category;

public DuplicateCategoryPage(WebDriver driver) {
	this.driver=driver;
}

@FindBy(how=How.CSS, using="input[name='categorydata']") WebElement Category;
@FindBy(how=How.CSS, using="input[value ='Add category']") WebElement AddCategorybutton;
@FindBy(how=How.XPATH, using="//body/span[1][contains(text(),'Test')]") WebElement Duplicate;



public void ValidateUserTableisAbletoAddCategory() {
	category = value;
	Category.sendKeys(category);
	AddCategorybutton.click();
	String actual = Duplicate.getText();
	String expected = "Test";
	assertEquals(actual, expected, "Message not displayed");
	
	
	
	
}

}