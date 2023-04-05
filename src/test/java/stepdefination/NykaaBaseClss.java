package stepdefination;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NykaaBaseClss {
static WebDriver driver;
public static void browserLaunch(String brow) {
if(brow.equalsIgnoreCase("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	
	}
else if(brow.equalsIgnoreCase("firefox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	
	}
else if(brow.equalsIgnoreCase("interneexplrer")) {
	WebDriverManager.iedriver().setup();
	driver=new InternetExplorerDriver();
	
	}
}
public static void urlLaunch(String url) {
driver.get(url);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.HOURS);
driver.manage().window().maximize();
}
public static void close() {
	driver.close();
}
public static void webElementMthd(String option,WebElement element) {
	if(option.equalsIgnoreCase("click")) {
		element.click();
	}
}
public String gettext(WebElement element) {
return element.getText();
}
public static void sendkeyToWebeLElement(WebElement element,String input) {
	element.sendKeys(input);
}
public static void screenshot(String save) throws IOException {
TakesScreenshot s=(TakesScreenshot) driver;
File screenshotAs = s.getScreenshotAs(OutputType.FILE);
File destfile=new File("E:\\nykaa_cucumber\\screenshot\\"+save+".pmg");
FileUtils.copyFile(screenshotAs, destfile);


}
public static void browserquite() {
	driver.quit();
}
public static void mouseActions(String action,WebElement element) {
	Actions a=new Actions(driver);

if(action.equalsIgnoreCase("move to Element")) {
	

	a.moveToElement(element).build().perform();	
}
else if(action.equalsIgnoreCase("doubleclick")) {

	a.doubleClick(element).build().perform();
}
else if(action.equalsIgnoreCase("right  click")) {

	a.contextClick().build().perform();
	
}
else if(action.equalsIgnoreCase("click and hold")) {

	a.clickAndHold(element).build().perform();
}
else if(action.equalsIgnoreCase("click")) {

	a.click(element).build().perform();
}
}
public static void switchToNewWindow() {
Set<String> windowHandles = driver.getWindowHandles();
List<String> l=new ArrayList<>(windowHandles);
for(int i=0;i<l.size();i++) {
driver.switchTo().window(l.get(i));	
}

}
public static void dropdown(WebElement element, String selectOrDeselectOption,String input) {

Select s=new Select(element);
if(selectOrDeselectOption.equalsIgnoreCase("select by index")) {
	int parseInt = Integer.parseInt(input);
	s.selectByIndex(parseInt);
}
else if(selectOrDeselectOption.equalsIgnoreCase("deselect by index")) {
	int parseInt = Integer.parseInt(input);
	s.selectByIndex(parseInt);
}
else if(selectOrDeselectOption.equalsIgnoreCase("select by value")) {
	s.selectByValue(input);
	}
else if(selectOrDeselectOption.equalsIgnoreCase("deselect by value")) {
	s.deselectByValue(input);
	}
else if(selectOrDeselectOption.equalsIgnoreCase("select by visible text")) {
	s.selectByVisibleText(input);
	}
else if(selectOrDeselectOption.equalsIgnoreCase("deselect by visible text")) {
	s.deselectByVisibleText(input);
	}}
public static void switchToFrame(String option,String input) {
	if(option.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(input);
		driver.switchTo().frame(parseInt);
	
	}
	if(option.equalsIgnoreCase("name pr id")) {
		driver.switchTo().frame(input);
}
}
public static void switchToFrame(WebElement element) {
driver.switchTo().frame(element);
}














}
