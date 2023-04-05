package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForSignin {
	@FindBy(xpath = "//button[text()='Sign in']")
	private WebElement signin;
	@FindBy(xpath = "//button[text()='Sign in with Mobile / Email']")
	private WebElement signinwithmobno;
	@FindBy(xpath = "//input[@name='emailMobile']")
	private WebElement mobno;
	@FindBy(xpath = "//div[text()='Login via Password']")
    private	WebElement loginPassword;
	@FindBy(xpath = "//input[@name='password']")
    private	WebElement password;
	@FindBy(xpath = "//button[text()='login']")
	private WebElement login;
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}


	public WebElement getSignin() {
		return signin;
	}
	public WebElement getLoginPassword() {
		return loginPassword;
	}
	public WebDriver getDri() {
		return dri;
	}
	public WebElement getSigninbutton() {
		return signin;
	}
	public WebElement getSigninwithmobno() {
		return signinwithmobno;
	}
	public WebElement getMobno() {
		return mobno;
	}
	public WebElement getProceed() {
		return proceed;
	}
	@FindBy(xpath = "//button[text()='proceed']")

	private WebElement proceed;
	WebDriver dri;
	public PomForSignin(WebDriver driver) {
		this.dri=driver;
		PageFactory.initElements(driver, this);
	}


}
