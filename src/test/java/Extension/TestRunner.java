package Extension;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        features="./src/test/java/features",
        glue={"Extension"},
        plugin={"html:target/cucumber-html-report"}
)

        public class TestRunner {


}

