package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForNewAddr {
	WebDriver	driver;
	public PomForNewAddr(WebDriver drivver) {
		this.driver=drivver;
		PageFactory.initElements(drivver, this);
		
	}
	@FindBy(xpath="//*[text()='Add New Address']")
private WebElement	addNewAddr;
	public WebElement getaddnewaddr() {
return addNewAddr;
	}
	@FindBy(xpath="(//*[@class='input-element  '])[1]")

private WebElement pincode;
	public WebElement getpincode() {
return pincode;
	}
	@FindBy(xpath="(//input[@type='text'])[3]")

private WebElement flatno;
	public WebElement getflatno() {
return flatno;
	}
	@FindBy(xpath="//textarea[@class='input-element input-area ']")

	private WebElement roadname;
		public WebElement getroadname() {
	return roadname;
		}
		@FindBy(xpath="(//input[@type='text'])[4]")

		private WebElement name;
			public WebElement getname() {
		return name;
			}
			@FindBy(xpath="(//input[@type='number'])[2]")

			private WebElement phneno;
				public WebElement getphnNo() {
			return phneno;
				}
				@FindBy(xpath="//button[text()='Ship to this address']")

				private WebElement shipaddr;
					public WebElement getShipAddr() {
				return shipaddr;
					}
}
