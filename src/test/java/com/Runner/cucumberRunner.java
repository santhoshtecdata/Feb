package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( 
		features={"src/test/resources/featureFiles/loginDataProvider.feature"},
		glue="com.stepDifinitions",
        dryRun =false,
        monochrome=true,
       // tags = "@smoke or @flow",
      //  plugin= {"rerun:target/failed_scenario.txt"}  failed report
         plugin = {"html:target/cucumberReport.html"}
		
		)


public class cucumberRunner {

	
	
}
