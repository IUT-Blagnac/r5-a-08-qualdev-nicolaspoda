import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
/*
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.cucumber.CucumberWithSerenity;
*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/dojo/resources", plugin = {"json:target/cucumber.json"})
public class RunCucumberTest {
}

/*
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/dojo/resources", plugin = {"json:target/cucumber.json"})
public class RunCucumberTest {
}
*/