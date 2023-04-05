package Runner1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepdefination.NykaaBaseClss;

@RunWith(Cucumber.class)//NEED JUNIT LIBRARY AND IMPORT  org.junit.runner.RunWith;
@CucumberOptions(features = "E:\\nykaa_cucumber\\src\\test\\java\\feature\\nykaa.feature",glue="stepdefination")
public class Runner1Class extends NykaaBaseClss {
	@BeforeClass
public static void launchbro() {
	browserLaunch("chrome");

}
	@AfterClass
public static void quiteBrowser() {
//browserquite();
}
}




