package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeColor {
	WebDriver driver;

	public ChangeColor(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement BlueColorButton;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement WhiteColorButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement BlueBackground;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteBackground;

	public String validatebuttonexist() {
		String blue = BlueColorButton.getText();
		return blue;
	}
	public void setcolortoblue() {
		BlueColorButton.click();

	}
	
	public void validatecolorchangedtoBlue() {
		String blueBackground = Color.fromString(BlueBackground.getCssValue("background-color")).asHex();
		System.out.println(blueBackground);
		
	}
	public String validatewhitebuttonexist() {
		String white = WhiteColorButton.getText();
		return white;
	}
	public void setcolortowhite() {
		WhiteColorButton.click();

	}
	
	public void validatecolorchangedtowhite() {
		String whiteBackground = Color.fromString(WhiteBackground.getCssValue("background-color")).asHex();
		System.out.println(whiteBackground);
		
	}
}
