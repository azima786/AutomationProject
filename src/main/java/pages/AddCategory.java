package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCategory extends BasePage {
WebDriver driver;
String value = "Test";
String category;

public AddCategory(WebDriver driver) {
	this.driver=driver;
}

@FindBy(how=How.CSS, using="input[name='categorydata']") WebElement Category;
@FindBy(how=How.CSS, using="input[value ='Add category']") WebElement AddCategorybutton;



public void ValidateUserTableisAbletoAddCategory() {
	category = value + randomnumber(999);
	Category.sendKeys(category);
	AddCategorybutton.click();
}

public void ValidateCategorywasadded() {		

List <WebElement> dropdown = driver.findElements(By.xpath("//select[@name='category']//option"));
for(int i = 0; i<dropdown.size(); i++)
if(dropdown.get(i).getText().equals(category)) {System.out.println("Found dropdown");
break;
}
		}
		}