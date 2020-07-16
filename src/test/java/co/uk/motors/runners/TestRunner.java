package co.uk.motors.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
// run with cucumber class

@CucumberOptions(
        // here I am specifying FEATURES, steDefinitions and Hooks

        //right click on features, copy path and paste, change backslach to foward slach

        features = ("src/test/java/co/uk/motors/features"),

        // specifying where my Hooks and stepDefinition
        // I told the selenium where my Hooks and stepDefinitions
        // (steDefinitions also called glue code) are

        glue = {"co/uk/motors/hooks", "co/uk/motors/stepDefinitions "},


        // where my report is stored, so that human can read it

        plugin = {"Pretty", "json:target/report.json",

        "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}



)



public class TestRunner
//TestRunner will help run test in one go
    // I do not need to extend test runner
    // TestRunner is the only place where I run out of class (start from the  TOP of public class TestRunner
{
}
