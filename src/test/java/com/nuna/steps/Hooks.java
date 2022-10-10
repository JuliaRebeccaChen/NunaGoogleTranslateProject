package com.nuna.steps;

import com.nuna.testbase.BaseClass;
import com.nuna.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void start() {
		BaseClass.setUp();
	}

	@After
	public void end(Scenario scenario) {
		byte[] picture;
		if (scenario.isFailed()) {
			// Take screenshot and save in /failed
			picture = CommonMethods.takeScreenshot("failed/" + scenario.getName());
		} else {
			// Take screenshot and save it in /passed folder
			picture = CommonMethods.takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

		BaseClass.tearDown();
	}

}
