package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForCaseonDelevery {
	WebDriver driver;
	public PomForCaseonDelevery(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//p[@class='css-1in2vcc eka6zu20'])[5]")
private WebElement	cashondelivery;
public WebElement getcashONdelivery() {
	return cashondelivery;
	
}
@FindBy(xpath = "//button[text()='Place order']")

private WebElement placeOrder;
public WebElement getplaceOrder() {
	return placeOrder;
	
}
@FindBy(xpath = "(//p[@class='css-lh15au eoygcm00'])[1]")

private WebElement orderConfm;
public WebElement getorderConfm() {
	return orderConfm;
	
}
@FindBy(xpath = "//span[@title=' Umasakthi']")

private WebElement userAcc;
public WebElement getuserAcc() {
	return userAcc;
	
}
@FindBy(xpath = "(//a[@href='/sales/order/history/v2?ptype=myOrder'])[1]")

private WebElement myOrder;
public WebElement getmyOrder() {
	return myOrder;
	
}
@FindBy(xpath = "(//span[text()='Order Details'])[1]")

private WebElement ordrDet;
public WebElement getordrDet() {
	return ordrDet;
	
}
@FindBy(xpath = "//button[text()='Cancel Order']")

private WebElement cancelOrd;
public WebElement getcancelOrd() {
	return cancelOrd;
	
}
@FindBy(xpath = "//span[text()='Select reason']")

private WebElement selectreason;
public WebElement getselectreason() {
	return selectreason;
	
}
@FindBy(xpath = "//div[text()='Wrong shade/size/colour ordered']")

private WebElement reason;
public WebElement getreason() {
	return reason;
	
}
@FindBy(xpath = "//button[text()='Confirm']")

private WebElement cancelCnfm;
public WebElement getcancelCnfm() {
	return cancelCnfm;
	
}

}
