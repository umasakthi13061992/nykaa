package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NykaaPageObjModelmanager {
private	PomForSignin signin;
WebDriver d;
private PomForSkinProdect skinproduct;
private PomForNewAddr newaddr;
private PomForCaseonDelevery cashOnDelevery;
public PomForCaseonDelevery getcashOnDelevery() {
	this.cashOnDelevery=new PomForCaseonDelevery( d);
	return cashOnDelevery;
}
public PomForSignin getSignin() {
	signin=new PomForSignin( d);
	return signin;
}
public NykaaPageObjModelmanager(WebDriver driver) {
this.d=driver;
PageFactory.initElements(driver, this);
}
public PomForNewAddr getnewaddr() {
	this.newaddr=new PomForNewAddr(d);
	
	return newaddr;
	
}
public PomForSkinProdect getSkinproduct() {
	this.skinproduct=new PomForSkinProdect(d);
	return skinproduct;
}

	


}
