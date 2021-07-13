package Cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features="classpath:Cucumber",
glue="Cucumber",
tags="",
monochrome=true,
dryRun=false,

plugin = {
		"pretty",
		"html:target/cucumber",
		"json:target/cucumber.json"
})
public class RunnerTest {

}
