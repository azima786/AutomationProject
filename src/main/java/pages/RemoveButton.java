package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveButton {
	WebDriver driver;
	WebElement Elements;

	public RemoveButton(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//ul/li/a/following-sibling::input[@name='todo[3]']")
	WebElement checkbox;

	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement RemoveButton;

	public void ValidateThatSingleItemCouldBeRemovedUsingRemoveButtonWhenSingleCheckboxIsSelected() {
		String startpath = "//ul/li[";
		String endpath = "]/input";

		List<WebElement> element = driver.findElements(By.xpath("//ul/li"));
		System.out.println("Total number of checkboxes before delete " + element.size());

		for (int i = 1; i <= element.size(); i++) {
			String actualpath = startpath + i + endpath;
			WebElement checkbox = driver.findElement(By.xpath(actualpath));

			
			element.clear();
			checkbox.click();
			RemoveButton.click();
			
			System.out.println("Total number of checkboxes after delete " + element.size());
		}
	}
}
