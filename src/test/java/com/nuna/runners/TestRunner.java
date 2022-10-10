package com.nuna.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// Specify which feature(s) to run
		features = "src/test/resources/features/",

		// Specify where the code for the above feature files is located
		glue = "com.nuna.steps",

		// True: it does not run the java classes, only checks if the feature files are
		// glued to some java code
		dryRun = false,

		tags = "@test",

		monochrome = true,

		plugin = { "pretty", // Prints the Ghergin steps into the console
				"html:target/cucumber-default-report", // Creates a basic html report in target folder
				"json:target/cucumber.json", // Stores every step of execution into this json file
				"rerun:target/failed.txt" }

)

public class TestRunner {

}
