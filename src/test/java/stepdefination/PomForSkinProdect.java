package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForSkinProdect {


	@FindBy(xpath = "//*[@href='https://www.nykaa.com/sp/pink-love-skin-sale/skincare-sale']")
	private	WebElement Skin;
	@FindBy(xpath = "(//a[contains(text(),'Night Cream')])[2]")

	private WebElement NnightCream;
	@FindBy(xpath = "//span[text()='Brand']")

	private WebElement brand;	
	@FindBy(xpath = "//label[@for='checkbox_Plum_2131']")

	private WebElement plum13;	
	@FindBy(xpath = "//*[@for='checkbox_Plum_2131']")

	private WebElement plumAddToBag;	
	@FindBy(xpath = "//button[@class='css-g4vs13']")

	private WebElement bag;	
	@FindBy(xpath = "//p[text()='Quantity : 1']")
	private WebElement qnty;	
	@FindBy(xpath = "(//li[@class='css-18fuhjc edkwwn3'])[2]")
	private WebElement noOfqnty;	
	
	@FindBy(xpath = "//span[text()='Proceed']")
	
	private WebElement proceed;	
	public WebElement getnoOfqnty() {
		return noOfqnty;
	}
	public WebElement getproceed() {
		return proceed;
	}
	public WebElement getqnty() {
		return qnty;
	}
	public WebElement getPlumAddToBag() {
		return plumAddToBag;
	}
	public WebElement getbag() {
		return bag;
	}
	public WebElement getplum13() {
		return plum13;
	}

	public WebElement getBrand() {
		return brand;
	}
	
	public WebElement getSkin() {
		return Skin;
	}
	public WebElement getNnightCream() {
		return NnightCream;
	}
	
	WebDriver driver;
	public PomForSkinProdect(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	// TODO Auto-generated method stub

}



