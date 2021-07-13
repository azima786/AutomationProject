package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChangeColor;
import util.BrowserFactory;

public class step {
	WebDriver driver;
	ChangeColor color;
	
	@Given("Set SkyBlue Background and then Set White Background")
	public void set_sky_blue_background_and_then_set_white_background() {
	  driver = BrowserFactory.init();
	}

	@When("I click on the Set Background blue button")
	public void i_click_on_the_set_background_blue_button() {
	  color = PageFactory.initElements(driver, ChangeColor.class);
	  color.setcolortoblue();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {
	  color.validatecolorchangedtoBlue();
	}

	@When("I click on the Set White Background button")
	public void i_click_on_the_set_white_background_button() {
	   
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {

	}
}
