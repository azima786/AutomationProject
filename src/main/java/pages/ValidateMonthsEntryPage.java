package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateMonthsEntryPage extends BasePage {
WebDriver driver;


public ValidateMonthsEntryPage(WebDriver driver) {
	this.driver=driver;
}

public void ValidateMonths() {		

List <WebElement> dropdown = driver.findElements(By.xpath("//select[@name='due_month']//option"));
for(int i = 1; i<dropdown.size(); i++) {
	String months = dropdown.get(i).getText();
System.out.println("Months listed in dropdow = " + months);
}
		}
		}