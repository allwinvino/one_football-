package oneFootballBase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateNewAccountUsingGMail extends BaseClassLocatorFind {
	@Test (priority=0)
	public void OpenCreateNewAccountPage() {
		launchBrowser();
		loadUrl("https://onefootball.com/payments/sign-up?redirect=payments%2Fprofile%2Faccount");
		maxBrowser();
		PageFactory.initElements(driver, POMLoactor.class);
		POMLoactor.AcceptCookies.click();	
	}
	@Test (priority=1,enabled=true)
	public void CreateAnAccount() {
		PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.ClickGmailButtonn.click();
        POMLoactor.EnterEmail.sendKeys("allwi12324@mailinator.com");
        POMLoactor.EnterPassword.sendKeys("AllWin@01");
        POMLoactor.ClickShowPasswordCheckBox.click();
        POMLoactor.ClickTermsAndConditionsCheckBox.click();
        POMLoactor.ClickUpToDateCheckBox.click();
        POMLoactor.clickCreateAccountButtonnn.click();
        POMLoactor.ClickNotNowButton.click();
	}
	@Test (priority=1,enabled=false)
	public void CreateAccountWithAlreadyExistsEmail() {
		PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.ClickGmailButtonn.click();
        POMLoactor.EnterEmail.sendKeys("allwi123@mailinator.com");
        POMLoactor.EnterPassword.sendKeys("AllWin@01");
        POMLoactor.ClickShowPasswordCheckBox.click();
        POMLoactor.ClickTermsAndConditionsCheckBox.click();
        POMLoactor.ClickUpToDateCheckBox.click();
        POMLoactor.clickCreateAccountButtonnn.click();
        String textname = POMLoactor.GetTextAlreadyExistsText.getText();
        System.out.println("The Text is "+ textname);
        POMLoactor.ClickCancelFromAlertEmailAlreadyExists.click();
	}
	@Test (priority=1,enabled=false)
	public void CreateAccountUsingInvalidGmail() {
		PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.ClickGmailButtonn.click();
        POMLoactor.EnterEmail.sendKeys("allwi123@mailinator.c");
        POMLoactor.EnterPassword.sendKeys("AllWin@01");
        POMLoactor.ClickTermsAndConditionsCheckBox.click();
        POMLoactor.CreateAccountDisabledButton.click();
        String GetText1 = POMLoactor.GetAccountCreationFailedText.getText();
        System.out.println("The Text is "+GetText1);
        POMLoactor.CancelNotification.click();
        
	}
	//createAccountByNotSelecting Terms And Conditions CheckBox
	@Test (enabled=false)
	public void CreateAccountByNotCheckingTermsAndConditionsCheckBox() {
		PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.ClickGmailButtonn.click();
        POMLoactor.EnterEmail.sendKeys("allwi123@mailinator.c");
        POMLoactor.EnterPassword.sendKeys("AllWin@01");
        boolean enabled1 =  POMLoactor.CreateAccountDisabledButton.isEnabled();
        System.out.println("The Create Account Button is Not Enabled if User Enters Invalid Email "+enabled1);
	}
	@Test (priority=1,enabled=false)
	public void CreateAccountwithInvalidPassword() {
		PageFactory.initElements(driver, POMLoactor.class);
        POMLoactor.ClickGmailButtonn.click();
        POMLoactor.EnterEmail.sendKeys("allwinvinoaj483603@mailinator.com");
        POMLoactor.EnterPassword.sendKeys("aaa");
        String GetTextInvalidPass =  POMLoactor.GetTextInvalidPassword.getText();
        System.out.println("The Text for Ivalid Password is "+GetTextInvalidPass);
       // POMLoactor.ClickTermsAndConditionsCheckBox.click();
      //  POMLoactor.clickCreateAccountButtonnn.click();
	}

}
