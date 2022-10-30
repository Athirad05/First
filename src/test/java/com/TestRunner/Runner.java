package com.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\DELL\\IdeaProjects\\First\\src\\test\\resources\\features",
glue="com.stepDefinition"
)
public class Runner {
}
