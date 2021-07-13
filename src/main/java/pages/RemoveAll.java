package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveAll {
WebDriver driver;

	public RemoveAll(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement ToggleAll;

	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement RemoveButton;
	
	public void ValidatealllistitemcouldberemovedusingremovebuttonandToggleAllon(){
ToggleAll.click();
		
		Boolean ToggleAllChecked = ToggleAll.isSelected();
			System.out.println("Toggle All checkbox is selected " + ToggleAllChecked);

			String startpath = "//ul/li[";
			String endpath = "]/input";

			List<WebElement> element = driver.findElements(By.xpath("//ul/li"));
			System.out.println("Total count of available checkboxes: " + element.size());
			
try {
			for (int i = 1; i <= element.size(); i++) {
				String actualpath = startpath + i + endpath;
				WebElement checkbox = driver.findElement(By.xpath(actualpath));
		
			checkbox.isSelected();
RemoveButton.click();
			} }catch(Exception e) {
System.out.println("Unable to locate. It has been deleted");

			}
}}

