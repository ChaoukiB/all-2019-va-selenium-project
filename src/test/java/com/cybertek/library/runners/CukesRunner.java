package com.cybertek.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/Cucumber.json"},
        features = "src/test/resources/features",

        glue = "com/cybertek/library/step_deinitions",
        dryRun = false,
        tags =  "@smoke"
)

public class CukesRunner {

}
//tags = "@staff"
//tags = "@staff and @student"
//tags = "@librarian or @admin" // run to scenario only
//tags = "@login"   // run the smoke with any of'@smoke' '@lib_100' '@login}
