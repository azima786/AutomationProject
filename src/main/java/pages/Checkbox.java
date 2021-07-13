package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Checkbox {
	WebDriver driver;
	WebElement Elements;

	public Checkbox(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement ToggleAll;


	public void ClickonToggleAll() {
		ToggleAll.click();
	}

	public void ConfirmCheckBoxesareselected() throws Exception {
		Boolean ToggleAllChecked = ToggleAll.isSelected();
		System.out.println("Toggle All checkbox is selected " + ToggleAllChecked);

		String startpath = "//ul/li[";
		String endpath = "]/input";

		List<WebElement> element = driver.findElements(By.xpath("//ul/li"));
		System.out.println("Total count of available checkboxes: " + element.size());

		for (int i = 1; i <= element.size(); i++) {
			String actualpath = startpath + i + endpath;
			WebElement checkbox = driver.findElement(By.xpath(actualpath));

			System.out.println("Checkbox # " + i + " is selected " + checkbox.isSelected());

		}
	}
}