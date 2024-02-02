package com.loop.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/html-reports/cucumber-reports.html",
                "json:target/json-reports/json-report.json"
                ,"rerun:target/rerun.txt"},
        features = "@target/rerun.txt",
        glue = "com/loop/step_definitions",
        monochrome = true,
        publish = false) // if true create a cucumer report


public class FailedRunner {


}
