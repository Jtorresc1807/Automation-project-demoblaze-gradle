package co.com.auto.project.demoblaze.gradle.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
tags = "@CaseDataDriven",
glue = "co/com/auto/project/demoblaze/gradle/stepdefinitions" )

public class RunnerTags {
}