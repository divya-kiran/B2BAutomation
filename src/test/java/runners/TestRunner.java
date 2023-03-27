package runners;

import baseClass.BaseClass;
import baseClass.FileReaderManager;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        tags = {"@ATC101"},
        monochrome = true
)
public class TestRunner {

    public static String globaldate = "";

    @BeforeClass
    public static void mainfunc() throws IOException {
        BaseClass.browserlaunch();
    }

    @AfterClass
    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
    }

    @AfterClass
    public static void quitdriver() {
        BaseClass.quitDriver();
    }
}


