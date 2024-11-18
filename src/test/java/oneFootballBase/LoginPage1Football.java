package oneFootballBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage1Football extends BaseClassLocatorFind {
	
	String [][] data = 
		{{"allwin@gmail.com" ,"AllWin@01"},
		{"allwinvinoaj486039@gmail.com" ,"vino"},
		{"allwin@gmail.com" ,"vino"},
		{"allwinvinoaj486039@gmail.com" ,"AllWin@01"}};
		
		
		@DataProvider (name = "logindata")
		public String[][] dataprovoiderr() {
		 return data;
	}
//    @Test (priority=0)
//   
//	public void  Launch() {
//		launchBrowser();
//		loadUrl("https://onefootball.com/payments/sign-in");
//		maxBrowser();
//	}
    @Test (dataProvider = "logindata", priority =1)
    public  void Login(String name,String pwd) {
    	launchBrowser();
	    loadUrl("https://onefootball.com/payments/sign-in");
		maxBrowser();
    	PageFactory.initElements(driver, POMLoactor.class);
    	POMLoactor.AcceptCookies.click();
    	POMLoactor.EmailButton.click();
    	POMLoactor.Email.sendKeys(name);
    	POMLoactor.Password.sendKeys(pwd);
    	POMLoactor.SignInButton.click();
    	driver.quit();
    	
    }
    
}
