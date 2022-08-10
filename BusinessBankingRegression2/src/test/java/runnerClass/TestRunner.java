package runnerClass;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber-reports/CucumberTestReport.json",
        retryCount = 1,
        detailedReport = true,
        detailedAggregatedReport = false,
        overviewReport = false,
        coverageReport = false,
        jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
        usageReport = false,
        toPDF = true,
//        excludeCoverageTags = {"@flaky" },
//        includeCoverageTags = {"@passed" },
        outputFolder = "target/cucumber-reports/extended-report")

@CucumberOptions(
        features =  {"features"},
        glue=       {"cucumberProject"},
        monochrome = true,
        plugin =    {
                    "pretty", "html:target/cucumber-reports/cucumber-html-report",
                    "json:target/cucumber-reports/CucumberTestReport.json",
                    "rerun:target/cucumber-reports/rerun.txt"}
        )

public class TestRunner {
	
}
