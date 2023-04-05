package stepdefination;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.junit.rules.ExpectedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class stepdefnation extends NykaaBaseClss  {
	NykaaPageObjModelmanager pom=new NykaaPageObjModelmanager(driver);
	@Given("launch url")
	public  void launch_url() {
		urlLaunch("https://www.nykaa.com/");

	}
	@When("sign in")
	public void sign_in() {
		pom.getSignin().getSigninbutton().click();
	}
	@When("sign in with mobile no")
	public void sign_in_with_mobile_no() {
		pom.getSignin().getSigninwithmobno().click();

	}
	@When("enter mob no and proceed")
	public void enter_mob_no_and_proceed() {
		pom.getSignin().getMobno().sendKeys("9176186867");
		pom.getSignin().getProceed().click();	}

	@When("login via password")
	public void login_via_password() {
		pom.getSignin().getLoginPassword().click();
	}
	@When("enter password and login")
	public void enter_password_and_login() {
		pom.getSignin().getPassword().sendKeys("9176186867");
		pom.getSignin().getLogin().click();

	}
	@Given("move to skin")
	public void move_to_skin() {

		WebElement getSkin = pom.getSkinproduct().getSkin();
		mouseActions("move to Element", getSkin);
	}
	@When("select night creame and click")
	public void select_night_creame_and_click() {
		WebElement nnightCream = pom.getSkinproduct().getNnightCream();
		nnightCream.click();
		// Set<String> windowHandles = driver.getWindowHandles();
		// List<String> l=new ArrayList<>(windowHandles);
		// for(int i=0;i<l.size();i++) {
		//	driver.switchTo().window(l.get(i)) ;
		//}
		// pom.getSkinproduct().getBrand().click();
	}


	@Given("switch to night creame window")
	public void switch_to_night_creame_window() throws InterruptedException {

		switchToNewWindow();
		pom.getSkinproduct().getBrand().click();
		Thread.sleep(3000);
		webElementMthd("click", pom.getSkinproduct().getplum13());	
		Thread.sleep(3000);

		//pom.getSkinproduct().getPlumAddToBag().click();

	}
	@When("find plum green night gel and click")
	public void find_plum_green_night_gel_and_click() throws InterruptedException {
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//	wait.until(ExpectedConditions.elementToBeClickable(pom.getSkinproduct().getplum13()));
		//webElementMthd("click", pom.getSkinproduct().getplum13());	}
	}
	@When("find add to bag and click")
	public void find_add_to_bag_and_click() throws InterruptedException 
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(pom.getSkinproduct().getPlumAddToBag()));;
		//	pom.getSkinproduct().getPlumAddToBag().click();

	}

	@When("find bag and click")
	public void find_bag_and_click() throws InterruptedException {
		Thread.sleep(3000);

		pom.getSkinproduct().getbag().click();
	}
	@When("switch to frame")
	public void switch_to_frame() {
		switchToFrame("index", "0");
	}
	@When("find qnty and select qnty and clock")
	public void find_qnty_and_select_qnty_and_clock() {
		pom.getSkinproduct().getqnty().click();
		pom.getSkinproduct().getnoOfqnty().click();
	}
	@When("proceed")
	public void proceed() throws InterruptedException {
		Thread.sleep(3000);
		pom.getSkinproduct().getproceed().click();
	}
	@When("find new address and click")
	public void find_new_address_and_click() {
		// pom=new NykaaPageObjModelmanager(driver);
		pom.getnewaddr().getaddnewaddr().click();
	}
	@When("enter address in given field")
	public void enter_address_in_given_field() throws InterruptedException {
		pom.getnewaddr().getpincode().sendKeys("603210");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(pom.getnewaddr().getflatno())).sendKeys("flat no 8/9");;
		//wait.until(ExpectedConditions.elementSelectionStateToBe(pom.getnewaddr().getflatno(), true));
		webElementMthd("click", pom.getnewaddr().getflatno());
		Thread.sleep(3000);
		sendkeyToWebeLElement(pom.getnewaddr().getflatno(), "flat no 8/9");
		//	pom.getnewaddr().getroadname().sendKeys("priya nagar,urapakkam");
		//	pom.getnewaddr().getname().sendKeys("umasakthi");
		//	pom.getnewaddr().getphnNo().sendKeys("9176186867");
		//	pom.getnewaddr().getShipAddr().click();;
		sendkeyToWebeLElement(pom.getnewaddr().getroadname(), "priya angar ,urapakkam");
		sendkeyToWebeLElement(pom.getnewaddr().getname(), "uma");
		sendkeyToWebeLElement(pom.getnewaddr().getphnNo(), "9176186867");



	}
	@When("ship to this addree")
	public void ship_to_this_addree() {
		webElementMthd("click", pom.getnewaddr().getShipAddr());

	}

	@When("find and click cash on delivery")
	public void find_and_click_cash_on_delivery() throws InterruptedException {
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//	wait.until(ExpectedConditions.elementToBeClickable(pom.getcashOnDelevery().getcashONdelivery()));
		//	pom.getSkinproduct().getPlumAddToBag().click();
		Thread.sleep(3000);
		webElementMthd("click", pom.getcashOnDelevery().getcashONdelivery());
	}

	@When("place order")
	public void place_order() {
		webElementMthd("click", pom.getcashOnDelevery().getplaceOrder());

	}

	@Then("take screen shot")
	public void take_screen_shot() throws IOException {
		screenshot("orderConform");

	}
	@Then("order confirm")
	public void order_confirm() {
		String expected="Order Confirmed!";
		String actual=gettext(pom.getcashOnDelevery().getorderConfm());
		Assert.assertEquals(expected, actual);
	}

	@When("move to user")
	public void move_to_user() throws InterruptedException {
		Thread.sleep(3000);
		//webElementMthd("click", pom.getcashOnDelevery().getuserAcc());
		mouseActions("move to Element",pom.getcashOnDelevery().getuserAcc());
	}

	@When("click my order")
	public void click_my_order() {
		webElementMthd("click", pom.getcashOnDelevery().getmyOrder());

	}

	@When("click order detail")
	public void click_order_detail() {
		webElementMthd("click", pom.getcashOnDelevery().getordrDet());

	}
	@When("click cancel order")
	public void click_cancel_order() {
		webElementMthd("click", pom.getcashOnDelevery().getcancelOrd());

	}

	@When("click and select reason")
	public void click_and_select_reason() {
		webElementMthd("click", pom.getcashOnDelevery().getselectreason());
		switchToFrame("index", "0");
		webElementMthd("click", pom.getcashOnDelevery().getreason());


	}

	@When("cancel order and confirm")
	public void cancel_order_and_confirm() {
		webElementMthd("click", pom.getcashOnDelevery().getcancelOrd());
		webElementMthd("click", pom.getcashOnDelevery().getcancelCnfm());

	}
	@Then("cancelation succesful")
	public void cancelation_succesful() {
	}
	@Then("take Screenshot")
	public void take_screenshot() {
	}	









}
